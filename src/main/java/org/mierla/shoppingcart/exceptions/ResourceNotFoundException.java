package org.mierla.shoppingcart.exceptions;


public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String categoryNotFound) {
        super(categoryNotFound);
    }
}
