package aptota.eshopapp.exception;

import aptota.eshopapp.response.ApiResponse;
import aptota.eshopapp.response.ErrorResponse;
import aptota.eshopapp.service.exception.CategoryNotFoundException;
import aptota.eshopapp.util.CommonUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ApiResponse<ErrorResponse>> handleCategoryNotFoundException(Exception exception) {
        return CommonUtil.getErrorResponse(HttpStatus.NOT_FOUND, ErrorResponse.builder()
                        .status(HttpStatus.NOT_FOUND.value())
                        .error(HttpStatus.NOT_FOUND.getReasonPhrase())
                        .message(exception.getMessage())
                        .timestamp(LocalDateTime.now())
                .build());
    }

}
