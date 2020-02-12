package com.APIProject.apiProject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String entity) {
        super("Record not found " + entity);
    }

}
