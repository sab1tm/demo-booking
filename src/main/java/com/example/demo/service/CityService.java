// CityService.java
package com.example.demo.service;

import com.example.demo.models.entity.CityEntity;
import com.example.demo.models.entity.HotelEntity;
import com.example.demo.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public CityEntity save(CityEntity entity) {
        return cityRepository.save(entity);
    }

    public List<CityEntity> getAllCities() {
        return cityRepository.findAll();
    }
}
