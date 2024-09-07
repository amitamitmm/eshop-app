package aptota.eshopapp.controller;

import aptota.eshopapp.constant.ValidationMessage;
import aptota.eshopapp.dto.CategoryDto;
import aptota.eshopapp.request.AddCategoryRequest;
import aptota.eshopapp.response.ApiResponse;
import aptota.eshopapp.service.ICategoryService;
import aptota.eshopapp.util.CommonUtil;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
@Validated
public class CategoryController {

    private final ICategoryService categoryService;

    @GetMapping("/{categoryId}")
    public ResponseEntity<ApiResponse<CategoryDto>> getCategoryById(
            @PathVariable @NotNull(message = ValidationMessage.MUST_HAVE_VALID_CATEGORY_ID) Long categoryId){
        return CommonUtil.getSuccessResponse( HttpStatus.OK, categoryService.findById(categoryId));
    }


    @PostMapping
    public ResponseEntity<ApiResponse<CategoryDto>> addCategory(@RequestBody @Valid AddCategoryRequest addCategoryRequest){
        return CommonUtil.getSuccessResponse( HttpStatus.CREATED, categoryService.addCategory(addCategoryRequest));
    }

}
