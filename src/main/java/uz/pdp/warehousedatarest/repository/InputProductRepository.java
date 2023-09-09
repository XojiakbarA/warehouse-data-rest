package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.InputProduct;

@RepositoryRestResource
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
    
}
