package org.API_Rest.restAPI.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class GlobalExceptionHandler {

    // Manipulador de exceções gerais
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseError> handleGeneralException(Exception ex) {
        ResponseError error = new ResponseError();
        error.setError("Erro interno do servidor: " + ex.getMessage());
        error.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Manipulador de BusinessException
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ResponseError> handleBusinessException(BusinessException ex) {
        ResponseError error = new ResponseError();
        error.setError(ex.getMessage());
        error.setStatusCode(HttpStatus.CONFLICT.value()); // Código de status para conflito
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }

    // Manipulador de NullPointerException (exemplo adicional)
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ResponseError> handleNullPointerException(NullPointerException ex) {
        ResponseError error = new ResponseError();
        error.setError("Erro de ponteiro nulo: " + ex.getMessage());
        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
