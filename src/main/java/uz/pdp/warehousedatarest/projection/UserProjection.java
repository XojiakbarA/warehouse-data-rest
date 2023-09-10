package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.User;

import java.util.Set;

@Projection(name = "user", types = User.class)
public interface UserProjection {
    Long getId();
    String getFirstName();
    String getLastName();
    Long getPhoneNumber();
    String getCode();
    Boolean getIsActive();
    Set<WarehouseProjection> getWarehouses();
}
