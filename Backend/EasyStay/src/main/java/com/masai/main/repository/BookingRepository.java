package com.masai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.main.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
