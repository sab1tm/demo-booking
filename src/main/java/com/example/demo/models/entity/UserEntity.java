package com.example.demo.models.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
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
    private Long id;
    @Column(length = 255)
    private String login;
    @Column(length = 255)
    private String password;
    @Column(length = 255)
    private String email;
    @CreationTimestamp
    private Timestamp createdDatetime;
    @UpdateTimestamp
    private Timestamp updatedDatetime;
    @Column(length = 255)
    private String role;
}