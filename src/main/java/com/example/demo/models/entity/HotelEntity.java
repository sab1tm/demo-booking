// HotelEntity.java
package com.example.demo.models.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "hotels")
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255)
    private String name;

    @OneToMany(mappedBy = "hotel")
    private List<UserEntity> users;

    public void setName(String hilton) {
    }

    public boolean getName() {
        return false;
    }
}