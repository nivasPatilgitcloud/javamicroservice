package userservice.userservice.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.annotations.UpdateTimestamp;
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

import userservice.userservice.entity.User;
import userservice.userservice.exception.UserResourceNotFoundException;
import userservice.userservice.service.UserService;

@RestController
@RequestMapping("/userapi")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getusers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/getsingleuser/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
		User userData = userService.getUser(id);
		return ResponseEntity.ok(userData);
	}
	
	@PostMapping("/saveuser")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User userData = userService.saveUser(user);
//	User saveUser(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userData);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
		try {
			String message = "User deleted successfully";
			userService.deleteUser(id);
			return ResponseEntity.status(HttpStatus.OK).body(message);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User with user-ID "+id+" does not exist on server");
		}
	}
	
	@PutMapping("/updateuser/{id}")
	User updateUser(@RequestBody User user, @PathVariable("id") Long id) {
		return userService.updateUser(user, id);
	}
}
