package com.mfa.springmsproduct.service;

import com.mfa.springmsproduct.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
