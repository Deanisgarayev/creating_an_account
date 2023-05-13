package com.springwork.homework25;

public class CheckException extends Exception{
    public CheckException(String message) {
        super(message);
    }

    public CheckException(String message, Throwable cause) {
        super(message, cause);
    }
}
