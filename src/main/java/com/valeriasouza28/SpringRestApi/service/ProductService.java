package com.valeriasouza28.SpringRestApi.service;

import com.valeriasouza28.SpringRestApi.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product update(Product product);

    void deleteById(Long id);
}
