package com.example.SpringBootMongoDB.repository;

import com.example.SpringBootMongoDB.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // Define custom query methods if needed
}
