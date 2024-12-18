package com.delivery.service.impl;

import com.delivery.model.User;
import com.delivery.repository.UserRepository;
import com.delivery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(String id, User user) {
        if (userRepository.existsById(id)){
            user.setId(id);
            return userRepository.save(user);
        }else {
            return null;
        }
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserByMobileNumber(int mobileNumber) {
        return userRepository.findByMobileNumber(mobileNumber);
    }
}
