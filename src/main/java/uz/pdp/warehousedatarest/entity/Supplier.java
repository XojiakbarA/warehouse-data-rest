package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "suppliers")
public class Supplier extends BaseEntity {
    @Column(nullable = false, unique = true, length = 12)
    private Long phoneNumber;

    @OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Input> inputs;
}
