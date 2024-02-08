package hotelservice.hotelservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotelservice.hotelservice.entity.HotelEntity;
import hotelservice.hotelservice.exceptions.ResourceNotFoundException;
import hotelservice.hotelservice.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	
	public HotelEntity saveHotel(HotelEntity hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}

	
	public List<HotelEntity> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	
	public HotelEntity updateHotel(HotelEntity hotel, Long hotelid) {
		
		Optional<HotelEntity> hoteldata = hotelRepository.findById(hotelid);
		if(hoteldata.isPresent()) {
			HotelEntity hotelData = hoteldata.get();
			hotelData.setHotelname(hotel.getHotelname());
			hotelData.setAddress(hotel.getAddress());
			hotelData.setAbout(hotel.getAbout());
			
			return hotelRepository.save(hotelData);
		}else {
			return null;
		}
	}

	
	public void deleteHotel(Long id) {
		// TODO Auto-generated method stub
		hotelRepository.deleteById(id);
		
	}

	
	public HotelEntity getSingleHotel(Long id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User with given id not found = "+id));
		
	}

}
