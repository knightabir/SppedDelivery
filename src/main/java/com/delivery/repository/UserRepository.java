package com.delivery.repository;

import com.delivery.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByMobileNumber(int mobileNumber);
}
