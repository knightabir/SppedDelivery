package com.delivery.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document
@Data
public class Store {
    @Id
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Product> products;
    private Map<String, String> location;
}
