package com.delivery.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Tracking {
    @Id
    private String id;
    private String orderId;
    private String deliveryPartnerId;
    private double currentLatitude;
    private double currentLongitude;
    private Date lastUpdate;
}
