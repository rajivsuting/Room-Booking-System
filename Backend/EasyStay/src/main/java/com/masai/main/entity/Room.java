package com.masai.main.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Column(columnDefinition = "LONGTEXT")
	private String description;
	private double price;
	private String location;
	@Column(columnDefinition = "LONGTEXT")
	private String imageUrl;
	
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private UserEntity owner;
	
	@OneToMany(mappedBy = "room")
	private List<Booking> bookings;

}
