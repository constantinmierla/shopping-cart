package com.dailycodework.dreamshops.exceptions;


public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String categoryNotFound) {
        super(categoryNotFound);
    }
}
