package com.valeriasouza28.SpringRestApi.repository;

import com.valeriasouza28.SpringRestApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
