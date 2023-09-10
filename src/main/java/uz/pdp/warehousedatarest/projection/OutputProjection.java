package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Output;

@Projection(name = "output", types = Output.class)
public interface OutputProjection extends IOProjection {
    ClientProjection getClient();
}
