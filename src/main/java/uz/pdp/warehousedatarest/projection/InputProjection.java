package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Input;

@Projection(name = "input", types = Input.class)
public interface InputProjection extends IOProjection {
    SupplierProjection getSupplier();
}
