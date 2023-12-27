package com.iktex.ecommerce.exception;

import lombok.AllArgsConstructor;


public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message){
        super(message);
    }
}
