package com.hotel.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "room", catalog = "newdb")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roomId;

  @NotBlank(message = "please add the room")
	private String name;
	private String roomType;
//	public Room() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Room(Integer roomId, String name, String roomType) {
//		super();
//		this.roomId = roomId;
//		this.name = name;
//		this.roomType = roomType;
//	}
//	public Integer getRoomId() {
//		return roomId;
//	}
//	public void setRoomId(Integer roomId) {
//		this.roomId = roomId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getRoomType() {
//		return roomType;
//	}
//	public void setRoomType(String roomType) {
//		this.roomType = roomType;
//	}

}
