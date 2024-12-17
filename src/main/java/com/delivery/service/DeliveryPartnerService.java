package com.delivery.service;

import com.delivery.model.DeliveryPartner;
import com.delivery.model.Order;

import java.util.List;

public interface DeliveryPartnerService {
    DeliveryPartner createDeliveryPartner(DeliveryPartner deliveryPartner);
    DeliveryPartner getDeliveryPartner(String id);
    List<DeliveryPartner> getAllDeliveryPartner();
    DeliveryPartner updateDeliveryPartner(String id, DeliveryPartner deliveryPartner);
    void deleteDeliveryPartner(String id);
    void assignDeliveryPartner(String OrderId, String deliveryPartnerId);
    List<Order> getAssignedOrders(String deliveryPartnerId);
}
