package com.shop.shop.spring.servises;

import com.shop.shop.spring.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAll();
    void addToUserBucket(Long productId, String username);
}