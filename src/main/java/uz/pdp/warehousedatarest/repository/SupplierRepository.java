package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.Supplier;
import uz.pdp.warehousedatarest.projection.SupplierProjection;

@RepositoryRestResource(excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    
}
