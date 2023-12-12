package com.example.SpringBootProject.service;

import com.example.SpringBootProject.model.User;
import com.example.SpringBootProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers() {

        return userRepository.findAll();
    }


    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }


    public User createUser(User user) {
        return userRepository.save(user);
    }
}
