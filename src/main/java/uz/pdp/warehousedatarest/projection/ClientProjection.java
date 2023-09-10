package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Client;

@Projection(name = "client", types = Client.class)
public interface ClientProjection extends BaseProjection {
    Long getPhoneNumber();
}
