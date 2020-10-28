package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(int id) {
        Optional<User> response = userRepository.findById(id);
        return response.orElse(null);
    }

    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }

    public void deleteUser(int id) {
        if (userRepository.findById(id).orElse(null) != null) {
            userRepository.deleteById(id);
        }
    }

    public User updateUser(User user) {
        User response = userRepository.findById(user.getId()).orElse(null);
        if (response != null) {
            response.setName(user.getName());
            userRepository.save(response);
        }
        return user;
    }
}