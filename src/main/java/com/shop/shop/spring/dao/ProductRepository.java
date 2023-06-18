package com.shop.shop.spring.dao;


import com.shop.shop.spring.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}