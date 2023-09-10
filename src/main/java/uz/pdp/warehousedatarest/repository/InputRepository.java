package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.Input;
import uz.pdp.warehousedatarest.projection.InputProjection;

@RepositoryRestResource(excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input, Long> {
    
}
