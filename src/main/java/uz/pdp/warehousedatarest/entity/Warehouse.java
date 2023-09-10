package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "warehouses")
public class Warehouse extends BaseEntity {
    @ManyToMany(mappedBy = "warehouses", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<User> users;

    @OneToMany(mappedBy = "warehouse", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Input> inputs;

    @OneToMany(mappedBy = "warehouse", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Output> outputs;
}
