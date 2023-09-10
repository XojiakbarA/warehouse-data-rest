package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Category;

@Projection(name = "category", types = Category.class)
public interface CategoryProjection extends BaseProjection {
    ParentCategoryProjection getParentCategory();
}
