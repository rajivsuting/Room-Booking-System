package com.masai.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.main.entity.Room;
import com.masai.main.exception.RoomException;
import com.masai.main.repository.RoomRepository;
import com.masai.main.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepository roomRepository;

	@Override
	public Room createRoom(Room room) {
		
		if(room.getPrice() == 0) throw new RoomException("Room price cannot be 0");
		return roomRepository.save(room);
	}

	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room getRoomById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room updateRoom(Long id, Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room deleteRoom(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
