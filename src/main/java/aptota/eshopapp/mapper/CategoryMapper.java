package aptota.eshopapp.mapper;

import aptota.eshopapp.dto.CategoryDto;
import aptota.eshopapp.model.Category;
import aptota.eshopapp.request.AddCategoryRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category addCategoryRequestToCategory(AddCategoryRequest addCategoryRequest);

    CategoryDto categoryToCategoryDto(Category category);

}
