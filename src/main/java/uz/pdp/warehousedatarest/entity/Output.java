package uz.pdp.warehousedatarest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "outputs")
public class Output extends IOEntity {
    @ManyToOne(optional = false)
    private Client client;

    @JsonIgnore
    @OneToMany(mappedBy = "output", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<OutputProduct> outputProducts;
}
