package com.example.demo.repository;

import com.example.demo.models.entity.UserEntity;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findAllByRole(String role);
    List<UserEntity> findAllByCity(String city);
    List<UserEntity> findAllByHotel(String hotel);
}
