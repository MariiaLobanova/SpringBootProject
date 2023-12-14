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

    public Optional<User> updateEmailById(Long id, String email){
        Optional<User> updateUser = userRepository.findById(id);

        if (updateUser.isPresent()){
            User user = updateUser.get();
            user.setEmail(email);
            return Optional.of(userRepository.save(user));
        }else{
            System.out.println("User doesnt exist");
            return null;
        }
    }

    public void deleteUser(Long id){
        Optional<User> deleteUser = userRepository.findById(id);

        if (deleteUser.isPresent()){
            User user = deleteUser.get();
            userRepository.delete(user);
        }else{
            System.out.println("User doesnt exist");
        }

    }
}
