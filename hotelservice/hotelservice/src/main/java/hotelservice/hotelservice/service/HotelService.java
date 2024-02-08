package hotelservice.hotelservice.service;

import java.util.List;

import hotelservice.hotelservice.entity.HotelEntity;

public interface HotelService {

	HotelEntity saveHotel(HotelEntity hotel);
	List<HotelEntity> getAllHotels();
	HotelEntity updateHotel(HotelEntity hotel, Long hotelid);
	public void deleteHotel(Long id);
	HotelEntity getSingleHotel(Long id);
	
	
}
