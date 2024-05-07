package com.me.rating.service.services;

import java.util.List;

import com.me.rating.service.entites.Rating;

public interface RatingService {

	//create
	Rating createRating(Rating rating);
	
	//get
	Rating getRating(String ratingId);
	
	//getall
	List<Rating> getAllRatings();
	
	///getall by hotel
	List<Rating> getallRatingsByHotelId(String hotelId);
	
	///getall by user
	List<Rating> getallRatingsByuserId(String userId);
}
