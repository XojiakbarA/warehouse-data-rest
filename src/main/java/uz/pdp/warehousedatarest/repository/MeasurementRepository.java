package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.Measurement;

@RepositoryRestResource
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    
}
