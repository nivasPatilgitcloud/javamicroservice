package ratingservice.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ratingservice.ratingservice.entity.RatingEntity;
@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, Long> {

	// custom methods
	List<RatingEntity> findByUserid(Long userid);
	List<RatingEntity> findByHotelid(Long hotelid);
}
