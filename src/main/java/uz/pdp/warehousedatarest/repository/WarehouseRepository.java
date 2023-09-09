package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.Warehouse;

@RepositoryRestResource
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    
}
