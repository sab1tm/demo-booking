// HotelService.java
package com.example.demo.service;

import com.example.demo.models.entity.HotelEntity;
import com.example.demo.repository.HotelRepository;
import org.hibernate.annotations.Generated;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Optional<HotelEntity> getById(Long id) {
        return hotelRepository.findById(id);
    }

    public HotelEntity save(HotelEntity entity) {
        return hotelRepository.save(entity);
    }

    public List<HotelEntity> getAllHotels() {
        return hotelRepository.findAll();
    }
}