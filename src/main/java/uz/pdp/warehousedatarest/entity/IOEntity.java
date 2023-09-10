package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@MappedSuperclass
@Data
public class IOEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Timestamp date;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Currency currency;

    @Column(nullable = false)
    private Integer factureNumber;

    @Column(nullable = false, unique = true)
    private String code;
}
