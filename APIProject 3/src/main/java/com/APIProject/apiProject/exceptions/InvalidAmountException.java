package com.APIProject.apiProject.exceptions;

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String entity, String property) {
        super("El monto es invalido para "+entity+ "."  + property);
    }
}