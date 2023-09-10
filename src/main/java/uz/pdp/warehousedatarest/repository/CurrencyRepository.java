package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.Currency;
import uz.pdp.warehousedatarest.projection.CurrencyProjection;

@RepositoryRestResource(excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    
}
