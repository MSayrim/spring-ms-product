package com.mfa.springmsproduct.repository;

import com.mfa.springmsproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
