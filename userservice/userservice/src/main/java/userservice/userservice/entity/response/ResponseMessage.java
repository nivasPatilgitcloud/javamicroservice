package userservice.userservice.entity.response;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;



@Getter
@Setter
@Builder
public class ResponseMessage {
	
	private String apiresponse;
	private String message;
	private Boolean success;
	private HttpStatus status;
	
	public ResponseMessage() {
		super();
	}
	
	public ResponseMessage(String apiresponse, String message, Boolean success, HttpStatus status) {
		super();
		this.apiresponse = apiresponse;
		this.message = message;
		this.success = success;
		this.status = status;
	}
	
	
	
}
