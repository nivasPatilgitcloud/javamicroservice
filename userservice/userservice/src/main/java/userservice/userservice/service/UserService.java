package userservice.userservice.service;

import java.util.List;
import java.util.Optional;

import userservice.userservice.entity.User;

public interface UserService {

	// save user
	User saveUser(User user);
	//Fetch all user
	List<User> getAllUsers();
	//get single user
	User getUser(Long id);
	//delete user
	public void deleteUser(Long id);
	//update user
	User updateUser(User user, Long id);
}
