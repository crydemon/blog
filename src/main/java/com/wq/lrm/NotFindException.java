package com.wq.lrm;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFindException extends RuntimeException{
    public NotFindException() {

    }
    public NotFindException(String msg) {
        super(msg);
    }
    public NotFindException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
