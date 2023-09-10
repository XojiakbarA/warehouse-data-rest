package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Currency;

@Projection(name = "currency", types = Currency.class)
public interface CurrencyProjection extends BaseProjection {
}
