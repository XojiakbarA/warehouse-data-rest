package uz.pdp.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "attachment_contents")
public class AttachmentContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] bytes;

    @OneToOne
    private Attachment attachment;
}
