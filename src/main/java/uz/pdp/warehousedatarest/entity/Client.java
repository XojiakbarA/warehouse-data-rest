package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "clients")
public class Client extends BaseEntity {
    @Column(nullable = false, unique = true, length = 12)
    private Long phoneNumber;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Output> outputs;
}
