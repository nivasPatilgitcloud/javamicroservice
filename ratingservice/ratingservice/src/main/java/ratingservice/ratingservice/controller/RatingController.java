package ratingservice.ratingservice.controller;

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

import ratingservice.ratingservice.entity.RatingEntity;
import ratingservice.ratingservice.service.RatingService;


@RestController
@RequestMapping("/ratingapi")
public class RatingController {

	@Autowired
	RatingService ratingService;
	
	@PostMapping("/saveratings")
	public ResponseEntity<RatingEntity> saveRatings(@RequestBody RatingEntity rating){
		RatingEntity ratingData = ratingService.saveRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingData);
	}
	
	@GetMapping("/getallratings")
	public ResponseEntity<List<RatingEntity>> getAllRatings(){
		return ResponseEntity.ok(ratingService.getAllRatings());
	}
	
	@GetMapping("/getratingbyuserid/{userid}")
	public ResponseEntity<List<RatingEntity>> getRatingByUserId(@PathVariable("userid") Long userid){
		return ResponseEntity.ok(ratingService.getRatingByUserId(userid));
	}
	
	@GetMapping("/getratingbyhotelid/{hotelid}")
	public ResponseEntity<List<RatingEntity>> getRatingByHotelId(@PathVariable("hotelid") Long hotelid){
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelid));
	}
}
