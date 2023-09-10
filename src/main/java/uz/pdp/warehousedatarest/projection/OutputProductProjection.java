package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.OutputProduct;

@Projection(name = "outputProduct", types = OutputProduct.class)
public interface OutputProductProjection extends IOProductProjection {
    OutputProjection getOutput();
}
