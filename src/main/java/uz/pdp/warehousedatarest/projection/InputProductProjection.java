package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.InputProduct;

import java.util.Date;

@Projection(name = "inputProduct", types = InputProduct.class)
public interface InputProductProjection extends IOProductProjection {
    Date getExpireDate();
    InputProjection getInput();
}
