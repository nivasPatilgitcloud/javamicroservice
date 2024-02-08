package hotelservice.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hotelservice.hotelservice.entity.HotelEntity;
import hotelservice.hotelservice.service.HotelService;

@RestController
@RequestMapping("/hotelapi")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;

	@PostMapping("/savehotel")
	public ResponseEntity<HotelEntity> saveHotel(@RequestBody HotelEntity hotel){
		HotelEntity hotelData = hotelService.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelData);
	}
	
	@GetMapping("/gethotels")
	public List<HotelEntity> getAllHotels(){
		return hotelService.getAllHotels();
	}
	
	@GetMapping("/getsinglehotel/{hotelid}")
	public ResponseEntity<HotelEntity> getSingleHotel(@PathVariable("hotelid") Long hotelid){
		HotelEntity getHotelData = hotelService.getSingleHotel(hotelid);
		return ResponseEntity.ok().body(getHotelData);
	}
	
	@PutMapping("/updatehotel/{hotelid}")
	public ResponseEntity<HotelEntity> updateHotel(@RequestBody HotelEntity hotel, @PathVariable("hotelid") Long hotelid){
		HotelEntity getHotelData = hotelService.updateHotel(hotel, hotelid);
		return ResponseEntity.ok().body(getHotelData);
	}
	
	@DeleteMapping("/deletehotel/{hotelid}")
	public ResponseEntity<String> deleteHotel(@PathVariable("hotelid") Long hotelid){
		try {
			String msg = "Hotel deleted successfully.";
			hotelService.deleteHotel(hotelid);
			return ResponseEntity.status(HttpStatus.OK).body(msg);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hotel with hotel ID "+hotelid+" does not exist on server");
		}
	}
}
