package com.delivery.service;

import com.delivery.model.Product;
import com.delivery.model.Store;

import java.util.List;

public interface StoreService {
    Store createStore(Store store);
    Store getStoreById(String id);
    List<Store> getAllStores();
    void deleteStore(String id);
    Store updateStore(String id,Store store);
    List<Product> getProductsByStoreId(String storeId);

}
