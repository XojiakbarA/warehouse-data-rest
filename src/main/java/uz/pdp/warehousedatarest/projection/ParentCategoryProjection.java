package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Category;

@Projection(name = "parentCategory", types = Category.class)
public interface ParentCategoryProjection extends BaseProjection {

}
