package com.delivery.service.impl;

import com.delivery.model.Product;
import com.delivery.model.Store;
import com.delivery.repository.StoreRepository;
import com.delivery.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;


    @Override
    public Store createStore(Store store) {
        return  storeRepository.save(store);
    }

    @Override
    public Store getStoreById(String id) {
        return storeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @Override
    public void deleteStore(String id) {
        storeRepository.deleteById(id);
    }

    @Override
    public Store updateStore(String id, Store store) {
        if (storeRepository.existsById(id)){
            store.setId(id);
            return storeRepository.save(store);
        }else {
            return null;
        }
    }

    @Override
    public List<Product> getProductsByStoreId(String storeId) {
        return storeRepository.findById(storeId).map(Store::getProducts).orElse(null);
    }
}
