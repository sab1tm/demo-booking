// RoomRepository.java
package com.example.demo.repository;

import com.example.demo.models.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
}