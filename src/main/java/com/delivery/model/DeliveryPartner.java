package com.delivery.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class DeliveryPartner {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int mobileNumber;
    private String email;
    private List<String> assignedOrders;
    private AccountDetails BankDetails;
}
