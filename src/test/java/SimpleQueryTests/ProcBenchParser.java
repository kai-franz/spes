package SimpleQueryTests;

import SimpleQueryTests.procBenchSchema.Customer;
import SimpleQueryTests.tableSchema.ACCOUNT;
import SimpleQueryTests.tableSchema.BONUS;
import SimpleQueryTests.tableSchema.DEPT;
import SimpleQueryTests.tableSchema.EMP;
import org.apache.calcite.adapter.java.JavaTypeFactory;
import org.apache.calcite.jdbc.JavaTypeFactoryImpl;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.type.RelDataTypeSystem;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql2rel.SqlToRelConverter;
import org.apache.calcite.tools.*;

public class ProcBenchParser {
        public static final JavaTypeFactory typeFactory = new JavaTypeFactoryImpl(RelDataTypeSystem.DEFAULT);
        public static final SchemaPlus defaultSchema = Frameworks.createRootSchema(true);

        private FrameworkConfig config = Frameworks.newConfigBuilder().defaultSchema(defaultSchema).build();
        private Planner planner = Frameworks.getPlanner(config);

        public ProcBenchParser(){
        addTableSchema();
        }

        public void addTableSchema(){
            SqlToRelConverter.configBuilder().build();
            defaultSchema.add("CUSTOMER", new Customer());
            defaultSchema.add("CATALOG_SALES", new SimpleQueryTests.procBenchSchema.CatalogSales());
            defaultSchema.add("CATALOG_SALES_HISTORY", new SimpleQueryTests.procBenchSchema.CatalogSalesHistory());
            defaultSchema.add("DATE_DIM", new SimpleQueryTests.procBenchSchema.DateDim());
            defaultSchema.add("CUSTOMER_ADDRESS", new SimpleQueryTests.procBenchSchema.CustomerAddress());
        }

        public RelNode getRelNode(String sql) throws SqlParseException, ValidationException, RelConversionException{
            SqlNode parse = planner.parse(sql);
            //System.out.println(parse.toString());
            SqlToRelConverter.configBuilder().build();
            SqlNode validate = planner.validate(parse);
            RelNode tree = planner.rel(validate).rel;
            //String plan = RelOptUtil.toString(tree,SqlExplainLevel.EXPPLAN_ATTRIBUTES); //explain(tree, SqlExplainLevel.ALL_ATTRIBUTES);
            //System.out.println(plan);
            return tree;
        }
    }
