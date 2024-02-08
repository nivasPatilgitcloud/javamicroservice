package hotelservice.hotelservice.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(String msg){
		super(msg);
	}
	
	public ResourceNotFoundException(){
		super("Hotel not found on server");
	}
}
