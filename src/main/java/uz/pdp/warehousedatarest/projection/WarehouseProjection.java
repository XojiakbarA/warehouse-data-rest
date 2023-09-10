package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Warehouse;

@Projection(name = "warehouse", types = Warehouse.class)
public interface WarehouseProjection extends BaseProjection {

}
