package aptota.eshopapp.request;

import aptota.eshopapp.constant.ValidationMessage;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddCategoryRequest {

    @NotEmpty(message = ValidationMessage.MUST_HAVE_CATEGORY_NAME)
    private String name;
}
