package com.tecnology.wilmak.msvc_products.repositories;

import com.tecnology.wilmak.msvc_products.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
