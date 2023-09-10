package uz.pdp.warehousedatarest.projection;

import java.sql.Timestamp;

public interface IOProjection {
    Long getId();
    Timestamp getDate();
    WarehouseProjection getWarehouse();
    CategoryProjection getCurrency();
    Integer getFactureNumber();
    String getCode();
}
