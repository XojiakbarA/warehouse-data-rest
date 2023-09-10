package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.Client;
import uz.pdp.warehousedatarest.projection.ClientProjection;

@RepositoryRestResource(excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
