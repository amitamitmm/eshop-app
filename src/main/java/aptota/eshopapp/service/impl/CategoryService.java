package aptota.eshopapp.service.impl;

import aptota.eshopapp.mapper.CategoryMapper;
import aptota.eshopapp.request.AddCategoryRequest;
import aptota.eshopapp.dto.CategoryDto;
import aptota.eshopapp.repository.CategoryRepository;
import aptota.eshopapp.service.ICategoryService;
import aptota.eshopapp.service.exception.CategoryNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryDto findById(Long id) {
         return categoryMapper.categoryToCategoryDto(categoryRepository.findById(id)
                 .orElseThrow(()->new CategoryNotFoundException("Category not found")));
    }

    @Override
    public CategoryDto addCategory(AddCategoryRequest addCategoryRequest) {
        return categoryMapper.categoryToCategoryDto(categoryRepository
                .save(categoryMapper.addCategoryRequestToCategory(addCategoryRequest)));
    }


}
