package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Product;

@Projection(name = "product", types = Product.class)
public interface ProductProjection extends BaseProjection {
    ParentCategoryProjection getCategory();
    AttachmentProjection getAttachment();
    String getCode();
    MeasurementProjection getMeasurement();
}
