package com.delivery.repository;

import com.delivery.model.Tracking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackingRepository extends MongoRepository<Tracking,String> {
}
