package userservice.userservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import userservice.userservice.entity.response.ResponseMessage;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserResourceNotFoundException.class)
	public ResponseEntity<ResponseMessage> handleResourceNotFoundException(UserResourceNotFoundException ex){
		String msg = ex.getMessage();
		ResponseMessage data = ResponseMessage.builder().message(msg).success(true).status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ResponseMessage>(data,HttpStatus.NOT_FOUND);
	}
}
