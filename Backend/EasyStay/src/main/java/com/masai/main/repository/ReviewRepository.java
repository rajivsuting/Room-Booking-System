package com.masai.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.main.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
