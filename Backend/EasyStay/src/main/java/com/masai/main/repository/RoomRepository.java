package com.masai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.main.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
