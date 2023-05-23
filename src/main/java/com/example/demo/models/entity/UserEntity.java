package com.example.demo.models.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    @Column(length = 255)
    private String login;
    private String password;
    private String email;
    @CreationTimestamp
    private Timestamp createdBy;
    private Timestamp updatedAt;
    @Column(length = 255)
    private String role;
}