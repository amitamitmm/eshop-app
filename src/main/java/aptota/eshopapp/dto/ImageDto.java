package aptota.eshopapp.dto;

import lombok.*;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageDto {
    private Long id;
    private String fileName;
    private String fileType;
    private Blob image;
    private String downloadUrl;
    private ProductDto product;
}
