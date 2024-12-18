package com.delivery.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.stream.Location;
import java.util.Map;

@Document
@Data
public class User {
    @Id
    private String id;
    private int mobileNumber;
    private String role;
    private String password;
    private String name;
    private String email;
    private String address;
    private Map<String,String> location;
}
