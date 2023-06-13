// RoomService.java
package com.example.demo.service;

import com.example.demo.models.entity.RoomEntity;
import com.example.demo.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    // Add methods for room-related operations if needed
}
