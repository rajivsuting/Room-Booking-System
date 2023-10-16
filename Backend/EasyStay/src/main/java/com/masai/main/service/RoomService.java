package com.masai.main.service;

import java.util.List;

import com.masai.main.entity.Room;

public interface RoomService {
	
	public Room createRoom(Room room);
	public List<Room> getAllRooms();
	public Room getRoomById(Long id);
	public Room updateRoom(Long id, Room room);
	public Room deleteRoom(Long id);

}
