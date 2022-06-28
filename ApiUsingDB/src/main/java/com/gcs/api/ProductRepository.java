package com.gcs.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcs.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
