package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.Output;
import uz.pdp.warehousedatarest.projection.OutputProjection;

@RepositoryRestResource(excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Long> {
    
}
