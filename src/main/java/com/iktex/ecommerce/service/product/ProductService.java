package com.iktex.ecommerce.service.product;

import com.iktex.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductService  {


    Product save(Product product);

    List<Product> getAll();

}

