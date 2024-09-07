package aptota.eshopapp.service;

import aptota.eshopapp.dto.CategoryDto;
import aptota.eshopapp.request.AddCategoryRequest;

public interface ICategoryService {
    CategoryDto findById(Long id);

    CategoryDto addCategory(AddCategoryRequest addCategoryRequest);
}
