package com.pa3.dashboard.Exceptions;



public class ResourceNotFoundException extends RuntimeException{

    private  String errorCode;

    public ResourceNotFoundException(String message, String errorCode)
    {
        super(message);
        this.errorCode = errorCode;
    }

    public ResourceNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public String getErrorCode() {
        return errorCode;
    }
}
