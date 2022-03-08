package com.test.Restful_API.domain;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//사용자 단일 조회 시 null로써 빈 화면이아닌 예외처리 
@ResponseStatus(HttpStatus.NOT_FOUND)//500번 아니라 404으로 클라이언트에게 전달
public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String message) {
		super(message);
	}
}
