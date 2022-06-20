package com.example.productcatalog.service;

import com.example.productcatalog.entity.Product;
import com.example.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts()
    {
        List<Product> products = new ArrayList<>();
        //findAll returns an iterable of Product class
        productRepository.findAll()
                .forEach(products::add);
        return products;
    }

    public void addProducts(Product product) {
        productRepository.save(product);
    }

    public Product getProductById(String prodId) {
       return productRepository.findById(prodId).get();
    }

    public void updateProduct(Product product, String id) {
        productRepository.save(product);
    }
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
