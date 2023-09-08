package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "output_products")
public class OutputProduct extends IOProductEntity {
    @ManyToOne(optional = false)
    private Output output;
}
