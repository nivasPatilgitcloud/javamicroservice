package ratingservice.ratingservice.service;

import java.util.List;

import ratingservice.ratingservice.entity.RatingEntity;

public interface RatingService {
	
	RatingEntity saveRating(RatingEntity rating);
	
	List<RatingEntity> getAllRatings();
	
	RatingEntity getSingleRating(Long ratingid);
	
	public void deleteRating(Long ratingid);
	
	List<RatingEntity> getRatingByUserId(Long userid);
	
	List<RatingEntity> getRatingByHotelId(Long hotelid);
}
