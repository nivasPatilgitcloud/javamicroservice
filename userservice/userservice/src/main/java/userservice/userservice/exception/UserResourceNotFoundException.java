package userservice.userservice.exception;

public class UserResourceNotFoundException extends RuntimeException {
	
	public UserResourceNotFoundException() {
		super("User not found on server.");
	}

	public UserResourceNotFoundException(String msg) {
		super(msg);
	}
}
