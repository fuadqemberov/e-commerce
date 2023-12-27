package com.iktex.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = true)
    private String name;

    private String description;

    private double price;

    @Column(name="cost_price", nullable = true)
    private double costPrice;

    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;


}
