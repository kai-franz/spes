package SimpleQueryTests.procBenchSchema;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;

public class CustomerAddress extends ProcBenchTable {
    @Override
    public RelDataType getRowType(RelDataTypeFactory typeFactory) {
        RelDataTypeFactory.FieldInfoBuilder b = typeFactory.builder();
        b.add("CA_ADDRESS_SK", typeFactory.createJavaType(Integer.class));
        b.add("CA_ADDRESS_ID", typeFactory.createJavaType(String.class));
        b.add("CA_STREET_NUMBER", typeFactory.createJavaType(String.class));
        b.add("CA_STREET_NAME", typeFactory.createJavaType(String.class));
        b.add("CA_STREET_TYPE", typeFactory.createJavaType(String.class));
        b.add("CA_SUITE_NUMBER", typeFactory.createJavaType(String.class));
        b.add("CA_CITY", typeFactory.createJavaType(String.class));
        b.add("CA_COUNTY", typeFactory.createJavaType(String.class));
        b.add("CA_STATE", typeFactory.createJavaType(String.class));
        b.add("CA_ZIP", typeFactory.createJavaType(String.class));
        b.add("CA_COUNTRY", typeFactory.createJavaType(String.class));
        b.add("CA_GMT_OFFSET", typeFactory.createJavaType(Double.class));
        b.add("CA_LOCATION_TYPE", typeFactory.createJavaType(String.class));
        return b.build();
    }
}
