package com.delivery.service.impl;

import com.delivery.model.DeliveryPartner;
import com.delivery.model.Order;
import com.delivery.repository.DeliveryPartnerRepository;
import com.delivery.repository.OrderRepository;
import com.delivery.service.DeliveryPartnerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPartnerServiceImpl implements DeliveryPartnerService {
    @Autowired
    private DeliveryPartnerRepository deliveryPartnerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public DeliveryPartner createDeliveryPartner(DeliveryPartner deliveryPartner) {
        return deliveryPartnerRepository.save(deliveryPartner);
    }

    @Override
    public DeliveryPartner getDeliveryPartnerById(String id) {
        return deliveryPartnerRepository.findById(id).orElse(null);
    }

    @Override
    public List<DeliveryPartner> getAllDeliveryPartners() {
        return deliveryPartnerRepository.findAll();
    }

    @Override
    public DeliveryPartner updateDeliveryPartner(String id, DeliveryPartner deliveryPartner) {
        if (deliveryPartnerRepository.existsById(id)) {
            deliveryPartner.setId(id);
            return deliveryPartnerRepository.save(deliveryPartner);
        } else {
            return null;
        }
    }

    @Override
    public void deleteDeliveryPartner(String id) {
        deliveryPartnerRepository.deleteById(id);
    }

    @Override
    public void assignOrderToDeliveryPartner(String orderId, String deliveryPartnerId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if (order != null) {
            order.setDeliveryPartnerId(deliveryPartnerId);
            order.setStatus("DISPATCHED");
            orderRepository.save(order);
        }
    }

    @Override
    public List<Order> getAssignedOrders(String deliveryPartnerId) {
        return orderRepository.findByDeliveryPartnerId(deliveryPartnerId);
    }
}

