// UserService.java
package com.example.demo.service;

import com.example.demo.models.entity.HotelEntity;
import com.example.demo.models.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserEntity> getById(Long id) {
        return userRepository.findById(id);
    }

    public UserEntity save(UserEntity entity) {
        return userRepository.save(entity);
    }

    public List<UserEntity> getByRole(String role) {
        return userRepository.findAllByRole(role);
    }

    public List<UserEntity> getByCity(String city) {
        return userRepository.findAllByCity(city);
    }

    public List<UserEntity> getByHotel(HotelEntity hotel) {
        return userRepository.findAllByHotel(hotel);
    }

    public List<UserEntity> getByRoom(Long room) {
        return userRepository.findAllByRoom(room);
    }
}
