package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "inputs")
public class Input extends IOEntity {
    @ManyToOne
    private Supplier supplier;

    @OneToMany(mappedBy = "input", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<InputProduct> inputProducts;
}
