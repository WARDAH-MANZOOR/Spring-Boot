package myFirstSpringBootProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;


@ControllerAdvice // Ye annotation is class ko global handler banati hai
public class GlobalExceptionHandler {

    // Sirf ResourceNotFoundException ko handle karega
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(ResourceNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(ex.getMessage(), 404);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Bonus: Baaki kisi bhi unexpected error ke liye (Server Crash etc.)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex) {
        ErrorResponse error = new ErrorResponse("An unexpected error occurred", 500);
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException ex) {
        // Pehla error message nikaalte hain
        String message = ex.getBindingResult()
                .getFieldErrors()
                .get(0)
                .getDefaultMessage();

        // ErrorResponse object banaya
        ErrorResponse error = new ErrorResponse(message, 400);

        // ResponseEntity ke saath 400 Bad Request bheja
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}