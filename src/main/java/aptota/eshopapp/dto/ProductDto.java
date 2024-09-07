package aptota.eshopapp.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private String brand;
    private int inventory;
    private String description;
    private CategoryDto category;
    private List<ImageDto> images;
}
