package com.hotel.management.service;

import java.util.List;

import com.hotel.management.model.Room;

public interface HotelManagementService {

	public List<Room> fetchRoomList();

	public Room saveRoom(Room room);

	public Room fetchRoomById(Integer roomId);

	public void deleteRoomById(Integer roomId);

}
