package com.delivery.repository;

import com.delivery.model.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store,String> {
}
