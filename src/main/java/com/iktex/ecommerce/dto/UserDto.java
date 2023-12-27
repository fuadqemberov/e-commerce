package com.iktex.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class UserDto {

    private Integer id;
    @JsonIgnore
    private String password;

    private String name;

    private String surname;

    private String email;

    private List<OrderDto> orders; // Kullanıcı siparişleri>

}
