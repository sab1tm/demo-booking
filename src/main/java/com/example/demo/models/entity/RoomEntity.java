// RoomEntity.java
package com.example.demo.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}