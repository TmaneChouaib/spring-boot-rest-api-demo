package com.tmane.restappdemo.exeption;

public class CharacterNoSuchElementException extends RuntimeException {
    private final Long id;

    public CharacterNoSuchElementException(String message, Long id) {
        super(message);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
