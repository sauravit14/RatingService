package com.me.rating.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.rating.service.entites.Rating;
import com.me.rating.service.services.RatingService;
import com.me.rating.service.util.Constant;

@RestController
@RequestMapping(Constant.RATINGSENDPOINT)
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	//create
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}
	
	//getall
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings(){
		return ResponseEntity.ok(ratingService.getAllRatings());
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId){
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getallRatingsByuserId(userId));
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getallRatingsByHotelId(hotelId));
	}
	
	@GetMapping("/{ratingId}")
	public ResponseEntity<Rating> getRatingById(@PathVariable String ratingId){
		return ResponseEntity.ok(ratingService.getRating(ratingId));
	}
	
}
