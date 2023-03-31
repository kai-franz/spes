package SimpleQueryTests.procBenchSchema;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;

public class CatalogSalesHistory extends ProcBenchTable {
    @Override
    public RelDataType getRowType(RelDataTypeFactory typeFactory) {
        RelDataTypeFactory.FieldInfoBuilder b = typeFactory.builder();
        b.add("CS_SOLD_DATE_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_SOLD_TIME_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_SHIP_DATE_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_BILL_CUSTOMER_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_BILL_CDEMO_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_BILL_HDEMO_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_BILL_ADDR_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_SHIP_CUSTOMER_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_SHIP_CDEMO_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_SHIP_HDEMO_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_SHIP_ADDR_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_CALL_CENTER_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_CATALOG_PAGE_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_SHIP_MODE_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_WAREHOUSE_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_ITEM_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_PROMO_SK", typeFactory.createJavaType(Integer.class));
        b.add("CS_ORDER_NUMBER", typeFactory.createJavaType(Integer.class));
        b.add("CS_QUANTITY", typeFactory.createJavaType(Integer.class));
        b.add("CS_WHOLESALE_COST", typeFactory.createJavaType(Double.class));
        b.add("CS_LIST_PRICE", typeFactory.createJavaType(Double.class));
        b.add("CS_SALES_PRICE", typeFactory.createJavaType(Double.class));
        b.add("CS_EXT_DISCOUNT_AMT", typeFactory.createJavaType(Double.class));
        b.add("CS_EXT_SALES_PRICE", typeFactory.createJavaType(Double.class));
        b.add("CS_EXT_WHOLESALE_COST", typeFactory.createJavaType(Double.class));
        b.add("CS_EXT_LIST_PRICE", typeFactory.createJavaType(Double.class));
        b.add("CS_EXT_TAX", typeFactory.createJavaType(Double.class));
        b.add("CS_COUPON_AMT", typeFactory.createJavaType(Double.class));
        b.add("CS_EXT_SHIP_COST", typeFactory.createJavaType(Double.class));
        b.add("CS_NET_PAID", typeFactory.createJavaType(Double.class));
        b.add("CS_NET_PAID_INC_TAX", typeFactory.createJavaType(Double.class));
        b.add("CS_NET_PAID_INC_SHIP", typeFactory.createJavaType(Double.class));
        b.add("CS_NET_PAID_INC_SHIP_TAX", typeFactory.createJavaType(Double.class));
        b.add("CS_NET_PROFIT", typeFactory.createJavaType(Double.class));
        return b.build();
    }
}
