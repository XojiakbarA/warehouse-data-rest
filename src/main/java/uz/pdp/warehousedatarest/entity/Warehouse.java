package uz.pdp.warehousedatarest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "warehouses")
public class Warehouse extends BaseEntity {
    @JsonIgnore
    @ManyToMany(mappedBy = "warehouses", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<User> users;

    @JsonIgnore
    @OneToMany(mappedBy = "warehouse", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Input> inputs;

    @JsonIgnore
    @OneToMany(mappedBy = "warehouse", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Output> outputs;
}
