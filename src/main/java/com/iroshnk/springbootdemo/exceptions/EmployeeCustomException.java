package com.iroshnk.springbootdemo.exceptions;

public class EmployeeCustomException extends RuntimeException {
    public EmployeeCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}