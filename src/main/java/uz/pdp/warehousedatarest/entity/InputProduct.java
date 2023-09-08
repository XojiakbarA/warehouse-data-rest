package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "input_products")
public class InputProduct extends IOProductEntity {
    @Column(nullable = false)
    private Date expireDate;

    @ManyToOne(optional = false)
    private Input input;
}
