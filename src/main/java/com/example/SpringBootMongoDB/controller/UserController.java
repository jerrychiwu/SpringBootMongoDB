package com.example.SpringBootMongoDB.controller;

import com.example.SpringBootMongoDB.model.User;
import com.example.SpringBootMongoDB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {

        System.out.println("UserController........................");

        this.userService = userService;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        System.out.println("getAllUsers..................");
        return userService.getAllUsers();
    }

//    @PostMapping("/")
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }

//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable String id) {
//        return userService.getUserById(id);
//    }
//
//    @PutMapping("/{id}")
//    public User updateUser(@PathVariable String id, @RequestBody User user) {
//        return userService.updateUser(id, user);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable String id) {
//        userService.deleteUser(id);
//    }
}
