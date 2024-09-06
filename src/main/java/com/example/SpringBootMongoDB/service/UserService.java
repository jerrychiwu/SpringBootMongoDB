package com.example.SpringBootMongoDB.service;

import com.example.SpringBootMongoDB.model.User;
import com.example.SpringBootMongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {

        System.out.println("UserService........................");

        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {

        System.out.println("userRepository.findAll()........................");

        return userRepository.findAll();
    }

    // Add more methods as needed
}
