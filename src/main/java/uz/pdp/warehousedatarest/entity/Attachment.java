package uz.pdp.warehousedatarest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToOne(mappedBy = "photo", fetch = FetchType.LAZY)
    private Product product;

    @JsonIgnore
    @OneToOne(mappedBy = "attachment", optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AttachmentContent attachmentContent;
}
