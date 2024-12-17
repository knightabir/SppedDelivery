package com.delivery.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

@Data
@Document
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private double discount;
    private Timestamp createdAt;
}
