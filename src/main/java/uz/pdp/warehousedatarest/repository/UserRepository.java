package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.warehousedatarest.entity.User;
import uz.pdp.warehousedatarest.projection.UserProjection;

@RepositoryRestResource(excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Long> {
    
}
