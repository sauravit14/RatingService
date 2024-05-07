package com.me.rating.service.implementaion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.rating.service.entites.Rating;
import com.me.rating.service.exceptions.ResourceNotFoundException;
import com.me.rating.service.repository.RatingRepository;
import com.me.rating.service.services.RatingService;

@Service
public class RatingServiceImplementaion implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		
		return ratingRepository.save(rating);
	}

	@Override
	public Rating getRating(String ratingId) {
		
		return ratingRepository.findById(ratingId).orElseThrow(() ->
		new ResourceNotFoundException("No ratings found with this rating id :" + ratingId));
	}

	@Override
	public List<Rating> getAllRatings() {
		
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getallRatingsByHotelId(String hotelId) {
		
		return ratingRepository.findByHotelId(hotelId);
	}

	@Override
	public List<Rating> getallRatingsByuserId(String userId) {
		
		return ratingRepository.findByUserId(userId);
	}

}
