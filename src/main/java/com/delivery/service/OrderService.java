package com.delivery.service;

import com.delivery.model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrderById(String id);
    List<Order> getAllOrders();
    Order updateOrder(String orderId, Order order);

    void deleteOrder(String id);

    List<Order> getOrdersByUserId(String userId);

    List<Order> getOrdersByStoreId(String storeId);

    List<Order> getOrdersByDeliveryPartnerId(String deliveryPartnerId);
}
