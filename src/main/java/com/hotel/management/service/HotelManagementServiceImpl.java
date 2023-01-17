package com.hotel.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.management.model.Room;
import com.hotel.management.repository.HotelManagementRepository;

@Service
public class HotelManagementServiceImpl implements HotelManagementService {

	@Autowired
	private HotelManagementRepository hotelManagementRepository;

	@Override
	public List<Room> fetchRoomList() {
		return (List<Room>) hotelManagementRepository.findAll();
	}

	@Override
	public Room saveRoom(Room room) {

		return hotelManagementRepository.save(room);
	}

	@Override
	public Room fetchRoomById(Integer roomId) {
		return hotelManagementRepository.findById(roomId).get();
	}

	@Override
	public void deleteRoomById(Integer roomId) {
		hotelManagementRepository.deleteById(roomId);

	}

}
