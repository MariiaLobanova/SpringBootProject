package com.example.SpringBootProject.model;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

@Entity
@Table(name = "user_data")
@NoArgsConstructor
@AllArgsConstructor
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Long id;
    private @Getter @Setter String name;
    private @Getter @Setter String lastName;
    private @Getter @Setter int age;

    @Email
    private @Getter @Setter String email;

}
