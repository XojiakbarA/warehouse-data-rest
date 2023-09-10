package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Supplier;

@Projection(name = "supplier", types = Supplier.class)
public interface SupplierProjection extends BaseProjection {
    Long getPhoneNumber();
}
