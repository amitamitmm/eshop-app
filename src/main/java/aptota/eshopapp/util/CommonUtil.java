package aptota.eshopapp.util;

import aptota.eshopapp.constant.SuccessMessage;
import aptota.eshopapp.response.ApiResponse;
import aptota.eshopapp.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CommonUtil {

    public static <T> ResponseEntity<ApiResponse<T>> getSuccessResponse(HttpStatus httpStatus, T response){
        return ResponseEntity.status(httpStatus).body(new ApiResponse<>(response, null));
    }

    public static ResponseEntity<ApiResponse<ErrorResponse>> getErrorResponse(HttpStatus httpStatus, ErrorResponse errorResponse){
        return ResponseEntity.status(httpStatus).body(new ApiResponse<>(null, errorResponse));
    }

}
