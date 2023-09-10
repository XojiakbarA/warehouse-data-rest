package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Attachment;

@Projection(name = "attachment", types = Attachment.class)
public interface AttachmentProjection {
    Long getId();
    String getName();
    Long getSize();
    String getContentType();
}
