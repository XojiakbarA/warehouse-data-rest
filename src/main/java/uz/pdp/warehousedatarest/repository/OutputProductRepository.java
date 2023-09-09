package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.OutputProduct;

@RepositoryRestResource
public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
    
}
