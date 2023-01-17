package com.hotel.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.management.model.Room;

@Repository
public interface HotelManagementRepository extends JpaRepository<Room, Integer> {

//	Room findById(Integer room_id);

//	void deleteById(Integer room_id);

}
