package SimpleQueryTests.procBenchSchema;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;

public class Customer extends ProcBenchTable {
    @Override
    public RelDataType getRowType(RelDataTypeFactory typeFactory) {
        RelDataTypeFactory.FieldInfoBuilder b = typeFactory.builder();
        b.add("C_CUSTOMER_SK", typeFactory.createJavaType(Integer.class));
        b.add("C_CUSTOMER_ID", typeFactory.createJavaType(String.class));
        b.add("C_CURRENT_CDEMO_SK", typeFactory.createJavaType(Integer.class));
        b.add("C_CURRENT_HDEMO_SK", typeFactory.createJavaType(Integer.class));
        b.add("C_CURRENT_ADDR_SK", typeFactory.createJavaType(Integer.class));
        b.add("C_FIRST_SHIPTO_DATE_SK", typeFactory.createJavaType(Integer.class));
        b.add("C_FIRST_SALES_DATE_SK", typeFactory.createJavaType(Integer.class));
        b.add("C_SALUTATION", typeFactory.createJavaType(String.class));
        b.add("C_FIRST_NAME", typeFactory.createJavaType(String.class));
        b.add("C_LAST_NAME", typeFactory.createJavaType(String.class));
        b.add("C_PREFERRED_CUST_FLAG", typeFactory.createJavaType(String.class));
        b.add("C_BIRTH_DAY", typeFactory.createJavaType(Integer.class));
        b.add("C_BIRTH_MONTH", typeFactory.createJavaType(Integer.class));
        b.add("C_BIRTH_YEAR", typeFactory.createJavaType(Integer.class));
        b.add("C_BIRTH_COUNTRY", typeFactory.createJavaType(String.class));
        b.add("C_LOGIN", typeFactory.createJavaType(String.class));
        b.add("C_EMAIL_ADDRESS", typeFactory.createJavaType(String.class));
        b.add("C_LAST_REVIEW_DATE", typeFactory.createJavaType(String.class));
        return b.build();
    }
}
