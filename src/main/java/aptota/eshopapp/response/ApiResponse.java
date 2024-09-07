package aptota.eshopapp.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse <T>{

    T data;
    ErrorResponse errorResponse;

    public ApiResponse(T data, ErrorResponse errorResponse) {
        this.data = data;
        this.errorResponse = errorResponse;
    }

    public static <T> ApiResponse<T> success(T data, ErrorResponse errorResponse) {
        return new ApiResponse<>(data, null);
    }

    public static ApiResponse<ErrorResponse> failure(ErrorResponse errorResponse) {
        return new ApiResponse<>(null, errorResponse);
    }

}
