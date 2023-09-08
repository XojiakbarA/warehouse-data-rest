package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class IOProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Product product;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private Double price;
}
