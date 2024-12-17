package com.delivery.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Data
public class Order {
    @Id
    private String id;
    private String userId;
    private String storeId;
    private double totalAmount;
    private List<OrderItem> items;
    private String discountCoupon;
    private String status; //PENDING, ACCEPTED, DISPATCHED, DELIVERED, CANCELED
    private Date orderDate;
    private Date DeliverDate;
}
