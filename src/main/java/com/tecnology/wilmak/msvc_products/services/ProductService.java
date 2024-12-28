package com.tecnology.wilmak.msvc_products.services;

import com.tecnology.wilmak.msvc_products.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);
}
