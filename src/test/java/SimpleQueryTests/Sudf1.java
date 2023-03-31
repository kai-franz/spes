package SimpleQueryTests;

import AlgeNode.AlgeNode;
import AlgeNodeParser.AlgeNodeParserPair;
import AlgeRule.AlgeRule;
import com.microsoft.z3.Context;
import org.apache.calcite.rel.RelNode;

public class Sudf1 {
    public static void main(String[] args) throws  Exception{
        Context z3Context = new Context();
        simpleParser parser = new simpleParser();
        RelNode newNode = parser.getRelNode("SELECT ca_state, d_year, d_qoy, SUM(cs_net_paid_inc_ship_tax) AS total_large_purchases\n" +
                "  FROM catalog_sales_history,\n" +
                "       customer,\n" +
                "       customer_address,\n" +
                "       date_dim\n" +
                " WHERE cs_bill_customer_sk = c_customer_sk\n" +
                "   AND c_current_addr_sk = ca_address_sk\n" +
                "   AND cs_net_paid_inc_ship_tax >= 1000\n" +
                "   AND d_date_sk = cs_sold_date_sk\n" +
                "   AND d_year IN (1998, 1999, 2000)\n" +
                "   AND ca_state IS NOT NULL\n" +
                " GROUP BY ca_state, d_year, d_qoy\n" +
                " ORDER BY ca_state, d_year, d_qoy");
        AlgeNode algeExpr = AlgeRule.normalize(AlgeNodeParserPair.constructAlgeNode(newNode,z3Context));
        System.out.println(algeExpr);
        simpleParser parser2 = new simpleParser();
        RelNode newNode2 = parser2.getRelNode("SELECT ca_state,\n" +
                "       d_year,\n" +
                "       d_qoy,\n" +
                "       (SELECT SUM(cs_net_paid_inc_ship_tax)\n" +
                "                   largePurchase\n" +
                "          FROM catalog_sales_history,\n" +
                "               customer,\n" +
                "               customer_address ca2,\n" +
                "               date_dim d2\n" +
                "         WHERE cs_bill_customer_sk = c_customer_sk\n" +
                "           AND c_current_addr_sk = ca_address_sk\n" +
                "           AND ca1.ca_state = ca2.ca_state\n" +
                "           AND cs_net_paid_inc_ship_tax >= 1000\n" +
                "           AND d_date_sk = cs_sold_date_sk\n" +
                "           AND d1.d_year = d2.d_year\n" +
                "           AND d1.d_qoy = d2.d_qoy) dt1\n" +
                "  FROM customer_address ca1,\n" +
                "       date_dim d1\n" +
                " WHERE d_year IN (1998, 1999, 2000)\n" +
                "   AND ca_state IS NOT NULL\n" +
                " GROUP BY ca_state, d_year, d_qoy\n" +
                " ORDER BY ca_state, d_year, d_qoy");
        AlgeNode algeExpr2 = AlgeRule.normalize(AlgeNodeParserPair.constructAlgeNode(newNode2,z3Context));
        System.out.println("second one");
        System.out.println(algeExpr2);
        System.out.println(algeExpr.isEq(algeExpr2));
    }

}
