package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "products")
public class Product extends BaseEntity {
    @ManyToOne
    private Category category;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Attachment attachment;

    @Column(nullable = false, unique = true)
    private String code = UUID.randomUUID().toString();

    @ManyToOne
    private Measurement measurement;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<InputProduct> inputProducts;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<OutputProduct> outputProducts;
}
