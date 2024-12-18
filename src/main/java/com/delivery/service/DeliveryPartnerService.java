package com.delivery.service;

import com.delivery.model.DeliveryPartner;
import com.delivery.model.Order;

import java.util.List;

public interface DeliveryPartnerService {
    DeliveryPartner createDeliveryPartner(DeliveryPartner deliveryPartner);

    DeliveryPartner getDeliveryPartnerById(String id);

    List<DeliveryPartner> getAllDeliveryPartners();

    DeliveryPartner updateDeliveryPartner(String id, DeliveryPartner deliveryPartner);
    void deleteDeliveryPartner(String id);

    void assignOrderToDeliveryPartner(String orderId, String deliveryPartnerId);

    List<Order> getAssignedOrders(String deliveryPartnerId);
}
