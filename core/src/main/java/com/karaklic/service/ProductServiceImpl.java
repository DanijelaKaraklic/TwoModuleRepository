package com.karaklic.service;

import com.karaklic.model.Product;
import com.karaklic.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional
    public Product findById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    @Transactional
    public void save(Product product) {
        productRepository.save(product);
    }
}
