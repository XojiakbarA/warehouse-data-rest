package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Measurement;

@Projection(name = "measurement", types = Measurement.class)
public interface MeasurementProjection extends BaseProjection {
}
