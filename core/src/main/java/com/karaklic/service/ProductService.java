package com.karaklic.service;


import com.karaklic.model.Product;

public interface ProductService {
    Product findById(Integer id);
    void save(Product product);
}
