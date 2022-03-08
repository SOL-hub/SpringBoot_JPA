package com.test.Restful_API.domain;

import java.util.Date;

//import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@JsonFilter("UserInfoV2")
public class UserV2 extends User{
	public UserV2(Integer id, String nickname, String account_type, String account_id, String quit, Date joinDate) {
		super(id, nickname, account_type, account_id, quit, joinDate);
		// TODO Auto-generated constructor stub
	}

	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
