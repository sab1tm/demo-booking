// UserEntity.java
package com.example.demo.models.entity;

import aj.org.objectweb.asm.ConstantDynamic;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

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

    @Column(length = 255)
    private String city;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;

    private Long room;

    public void setId(long l) {
    }

    public void setEmail(String s) {
    }

    public void setRole(String admin) {
    }

    public void setCity(String astana) {
    }

    public void setHotel(HotelEntity hilton) {
    }

    public void setRoom(long l) {
    }

    public ConstantDynamic getHotel() {
        return null;
    }

    public boolean getRoom() {
        return false;
    }
}
