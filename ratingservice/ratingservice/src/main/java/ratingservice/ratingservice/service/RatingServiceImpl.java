package ratingservice.ratingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ratingservice.ratingservice.entity.RatingEntity;
import ratingservice.ratingservice.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository ratingRepository; 


	public RatingEntity saveRating(RatingEntity rating) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rating);
	}


	public List<RatingEntity> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}


	public RatingEntity getSingleRating(Long ratingid) {
		return null;
	}


	public void deleteRating(Long ratingid) {
		// TODO Auto-generated method stub
		ratingRepository.deleteById(ratingid);
	}


	public List<RatingEntity> getRatingByUserId(Long userid) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserid(userid);
	}


	public List<RatingEntity> getRatingByHotelId(Long hotelid) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelid(hotelid);
	}

}
