package com.example.mvc.service;

import com.example.mvc.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProducts();
    public Product getProductById(int id);
    public void addProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);
}
