package com.codeapps.domain.repository;

import java.util.List;
import java.util.Optional;

import com.codeapps.domain.Product;

public interface ProductRespository {
    List<Product> getAll();
    Optional<Product> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int ProductId);
    Product save(Product product);
    void delete(int Product);
}
