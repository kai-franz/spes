package SimpleQueryTests.procBenchSchema;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;

public class DateDim extends ProcBenchTable {
    @Override
    public RelDataType getRowType(RelDataTypeFactory typeFactory) {
        RelDataTypeFactory.FieldInfoBuilder b = typeFactory.builder();
        b.add("D_DATE_SK", typeFactory.createJavaType(Integer.class));
        b.add("D_DATE_ID", typeFactory.createJavaType(String.class));
        b.add("D_DATE", typeFactory.createJavaType(String.class));
        b.add("D_MONTH_SEQ", typeFactory.createJavaType(Integer.class));
        b.add("D_WEEK_SEQ", typeFactory.createJavaType(Integer.class));
        b.add("D_QUARTER_SEQ", typeFactory.createJavaType(Integer.class));
        b.add("D_YEAR", typeFactory.createJavaType(Integer.class));
        b.add("D_DOW", typeFactory.createJavaType(Integer.class));
        b.add("D_MOY", typeFactory.createJavaType(Integer.class));
        b.add("D_DOM", typeFactory.createJavaType(Integer.class));
        b.add("D_QOY", typeFactory.createJavaType(Integer.class));
        b.add("D_FY_YEAR", typeFactory.createJavaType(Integer.class));
        b.add("D_FY_QUARTER_SEQ", typeFactory.createJavaType(Integer.class));
        b.add("D_FY_WEEK_SEQ", typeFactory.createJavaType(Integer.class));
        b.add("D_DAY_NAME", typeFactory.createJavaType(String.class));
        b.add("D_QUARTER_NAME", typeFactory.createJavaType(String.class));
        b.add("D_HOLIDAY", typeFactory.createJavaType(String.class));
        b.add("D_WEEKEND", typeFactory.createJavaType(String.class));
        b.add("D_FOLLOWING_HOLIDAY", typeFactory.createJavaType(String.class));
        b.add("D_FIRST_DOM", typeFactory.createJavaType(Integer.class));
        b.add("D_LAST_DOM", typeFactory.createJavaType(Integer.class));
        b.add("D_SAME_DAY_LY", typeFactory.createJavaType(Integer.class));
        b.add("D_SAME_DAY_LQ", typeFactory.createJavaType(Integer.class));
        b.add("D_CURRENT_DAY", typeFactory.createJavaType(String.class));
        b.add("D_CURRENT_WEEK", typeFactory.createJavaType(String.class));
        b.add("D_CURRENT_MONTH", typeFactory.createJavaType(String.class));
        b.add("D_CURRENT_QUARTER", typeFactory.createJavaType(String.class));
        b.add("D_CURRENT_YEAR", typeFactory.createJavaType(String.class));
        return b.build();
    }
}
