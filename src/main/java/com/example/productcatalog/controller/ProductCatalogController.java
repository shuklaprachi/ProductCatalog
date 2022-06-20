package com.example.productcatalog.controller;

import com.example.productcatalog.entity.Product;
import com.example.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductCatalogController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping("products/{prodId}")
    public Product getProduct(@PathVariable("prodId") String prodId){
        //return new Product(prodId, "Hard Drive", "2 Terabytes HDD", 6500, true);
        return productService.getProductById(prodId);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/products")
        public void addProduct(@RequestBody Product product)
        {
            productService.addProducts(product);
        }

    @RequestMapping(method = RequestMethod.PUT, value="/products/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable String id){
        productService.updateProduct(product, id);
     }
    @RequestMapping(method = RequestMethod.DELETE, value="/products/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
