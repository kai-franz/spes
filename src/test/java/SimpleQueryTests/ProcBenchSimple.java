package SimpleQueryTests;

import AlgeNode.AlgeNode;
import AlgeNodeParser.AlgeNodeParserPair;
import AlgeRule.AlgeRule;
import com.microsoft.z3.Context;
import org.apache.calcite.rel.RelNode;

public class ProcBenchSimple {
    public static void main(String[] args) throws Exception {
        Context z3Context = new Context();
        ProcBenchParser parser = new ProcBenchParser();
        RelNode newNode = parser.getRelNode("select c_customer_sk from customer");
        AlgeNode algeExpr = AlgeRule.normalize(AlgeNodeParserPair.constructAlgeNode(newNode,z3Context));
        System.out.println(algeExpr);

        ProcBenchParser parser2 = new ProcBenchParser();
        RelNode newNode2 = parser2.getRelNode("select c_customer_sk from customer");
        AlgeNode algeExpr2 = AlgeRule.normalize(AlgeNodeParserPair.constructAlgeNode(newNode2,z3Context));
        System.out.println("second one");
        System.out.println(algeExpr2);
        System.out.println(algeExpr.isEq(algeExpr2));
    }

}
