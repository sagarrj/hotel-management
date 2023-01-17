package com.hotel.management.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.management.model.Room;
import com.hotel.management.service.HotelManagementService;

@RestController
//@CrossOrigin("room")
public class HotelManagementController {
	@Autowired
	private HotelManagementService hotelManagementService;

	private final Logger logger = LoggerFactory.getLogger(HotelManagementController.class);

	@PostMapping("/hotel")
	public Room saveRoom(@Valid @RequestBody Room room) {
		logger.info("inside the saveRoom");
		return hotelManagementService.saveRoom(room);
		// return room;

	}

	@GetMapping("/hotel")
	public List<Room> fetchRoomList() {
		return hotelManagementService.fetchRoomList();

	}

	@GetMapping("/hotel/{roomId}")
	public Room fetchDepartmentById(@PathVariable("roomId") Integer roomId) {
		return hotelManagementService.fetchRoomById(roomId);

	}

	@DeleteMapping("/hotel/{roomId}")
	public String deleteRoomById(@PathVariable("roomId") Integer roomId) {

		hotelManagementService.deleteRoomById(roomId);
		return "Room got Deleted successfully";
	}
}
