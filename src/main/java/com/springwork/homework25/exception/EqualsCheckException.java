package com.springwork.homework25.exception;

public class EqualsCheckException extends RuntimeException {
    public EqualsCheckException(String message) {
        super(message);
    }

    public EqualsCheckException(String message, Throwable cause) {
        super(message, cause);
    }
}

