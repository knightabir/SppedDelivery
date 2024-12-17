package com.delivery.repository;

import com.delivery.model.DeliveryPartner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryPartnerRepository extends MongoRepository<DeliveryPartner,String> {
}
