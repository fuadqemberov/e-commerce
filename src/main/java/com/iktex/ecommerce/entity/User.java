package com.iktex.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = true)
    private String name;

    @Column(name="username", nullable = true)
    private String username;
    @Column(name="email", nullable = true)
    private String email;
    @Column(name="password", nullable = true)
    private String password;

    @Column(name="balance", nullable = true)
    private double balance; // Kullanıcı bakiyesi

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    // Constructors, getters, setters, etc.
}