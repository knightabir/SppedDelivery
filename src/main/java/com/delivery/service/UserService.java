package com.delivery.service;

import com.delivery.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById (String id);
    List<User> getAllUsers();
    User updateUser(String id, User user);
    void deleteUser(String id);
    User getUserByMobileNumber(String mobileNumber);
}
