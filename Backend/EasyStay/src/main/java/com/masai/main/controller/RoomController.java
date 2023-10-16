package com.masai.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.main.entity.Room;
import com.masai.main.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Room> createRoom(@RequestBody Room room){
		
		Room savedRoom = roomService.createRoom(room);
		return new ResponseEntity<Room>(savedRoom, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Room>> getAllRooms(){
		
		return null;
	}

}
