package com.example.demo.service;

import com.example.demo.models.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
}
