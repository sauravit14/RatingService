package com.me.rating.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.rating.service.entites.Rating;

public interface RatingRepository extends MongoRepository<Rating, String>{

	List<Rating> findByHotelId(String hotelId);
	List<Rating> findByUserId(String userId);
}
