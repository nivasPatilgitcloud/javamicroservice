package userservice.userservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import userservice.userservice.entity.Hotel;
import userservice.userservice.entity.Rating;
import userservice.userservice.entity.User;
import userservice.userservice.exception.UserResourceNotFoundException;
import userservice.userservice.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User getUser(Long id) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(id).orElseThrow(()-> new UserResourceNotFoundException("User with given id not found = "+id));
		Rating[] userRatingData = restTemplate.getForObject("http://RATING-SERVICE/ratingapi/getratingbyuserid/"+user.getId(), Rating[].class);
		List<Rating> ratingData =Arrays.stream(userRatingData).collect(Collectors.toList());
		
//		List<Rating> ratingList = ratingData.stream().map(rating -> {
//			ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://localhost:8083/hotelapi/getsinglehotel/"+user.getId(), Hotel.class);
//			Hotel hotel = forEntity.getBody();
//			rating.setHotel(hotel);
//			return rating;
//		}).collect(Collectors.toList());
		
		List<Rating> ratingList = ratingData.stream().map(rating -> {
			ResponseEntity<Hotel> forEntityData = restTemplate.getForEntity("http://HOTEL-SERVICE/hotelapi/getsinglehotel/"+rating.getHotelid(), Hotel.class);
			Hotel hotel = forEntityData.getBody();
			rating.setHotel(hotel);
			return rating;
		}).collect(Collectors.toList()); 
			
		
		user.setRatings(ratingList);
		return user;
	}

	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	public User updateUser(User user, Long id) {
		//User userData = userRepository.findById(id).get();
		Optional<User> userIdData = userRepository.findById(id);
		if(userIdData.isPresent()) {
			User userData = userIdData.get();
			userData.setName(user.getName());
			userData.setEmail(user.getEmail());
			userData.setAddress(user.getAddress());
			return userRepository.save(userData);
		}else {
			return null;
		}
		
	}

}
