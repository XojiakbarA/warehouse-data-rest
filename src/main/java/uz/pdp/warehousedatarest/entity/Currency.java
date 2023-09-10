package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "currencies")
public class Currency extends BaseEntity {
    @OneToMany(mappedBy = "currency", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Input> inputs;

    @OneToMany(mappedBy = "currency", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Output> outputs;
}
