package com.delivery.service.impl;

import com.delivery.model.Product;
import com.delivery.repository.ProductRepository;
import com.delivery.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(String productId, Product product) {
        if (productRepository.existsById(productId)){
            product.setId(productId);
            return productRepository.save(product);
        }else {
            return null;
        }
    }

    @Override
    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> getProductByStoreId(String storeId) {
        return productRepository.findByStoreId(storeId);
    }
}
