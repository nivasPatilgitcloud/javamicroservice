package hotelservice.hotelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotelservice.hotelservice.entity.HotelEntity;
@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {

}
