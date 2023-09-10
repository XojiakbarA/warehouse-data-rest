package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true, length = 12)
    private Long phoneNumber;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String code = UUID.randomUUID().toString();

    @Column(nullable = false)
    private Boolean isActive = false;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Warehouse> warehouses;
}
