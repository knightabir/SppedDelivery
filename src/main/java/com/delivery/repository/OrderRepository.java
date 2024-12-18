package com.delivery.repository;

import com.delivery.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,String> {
    List<Order> findByUserId(String userId);
    List<Order> findByStoreId(String storeId);
    List<Order> findByDeliveryPartnerId(String deliveryPartnerId);
}
