package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "attachments")
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long size;

    @Column(nullable = false)
    private String contentType;

    @OneToOne(mappedBy = "attachment", fetch = FetchType.LAZY)
    private Product product;

    @OneToOne(mappedBy = "attachment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AttachmentContent attachmentContent;
}
