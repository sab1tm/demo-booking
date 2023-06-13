// CityEntity.java
package com.example.demo.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cities")
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255)
    private String name;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}