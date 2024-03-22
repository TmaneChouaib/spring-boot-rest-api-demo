package com.tmane.restappdemo.exeption;

public class PersonnageNoSuchElementException extends RuntimeException {
    private final Long id;

    public PersonnageNoSuchElementException(String message, Long id) {
        super(message);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
