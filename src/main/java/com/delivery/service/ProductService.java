package com.delivery.service;

import com.delivery.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product getProductById(String productId);
    List<Product> getAllProduct();
    Product updateProduct(String productId, Product product);
    void deleteProduct(String productId);
    List<Product> getProductByStoreId(String storeId);
}
