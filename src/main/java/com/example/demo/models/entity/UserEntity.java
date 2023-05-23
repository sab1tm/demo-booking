package com.example.demo.models.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    @CreatedBy
    private LocalDate createdBy;
}
