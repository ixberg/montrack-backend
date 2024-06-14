package com.springdatajjpa.montrack.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Setter
@Data
public class ApplicationException extends RuntimeException {

    private HttpStatus httpStatus;
    private List<String> erros;
    private Object data;

    public ApplicationException(String message) {
        this(HttpStatus.BAD_REQUEST, message);
    }

    public ApplicationException(HttpStatus httpStatus, String message) {
        this(httpStatus, message, Collections.singletonList(message), null);
    }

    public ApplicationException(HttpStatus httpStatus, String message, List<String> errors, Object data) {
        super(message);
        this.httpStatus = httpStatus;
        this.erros = errors;
        this.data = data;
    }
}
