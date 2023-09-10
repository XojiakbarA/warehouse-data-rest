package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.Warehouse;
import uz.pdp.warehousedatarest.projection.WarehouseProjection;

@RepositoryRestResource(excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    
}
