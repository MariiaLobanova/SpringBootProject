package com.example.SpringBootProject.repository;

import com.example.SpringBootProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
