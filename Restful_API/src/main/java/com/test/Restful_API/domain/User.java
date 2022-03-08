package com.test.Restful_API.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

//@Data
//@AllArgsConstructor
public class User {
	private Integer id; 		 		//아이디
	
	@Size(min=2, message = "10글자 이상입력해세요")
	private String nickname; 		//닉네임
	private String account_type; 	//계정타입 (LESSOR : 임대인, REALTOR : 공인 중개사, LESSEE : 임차인)
	private String account_id;		//계정 Id
	private String quit;			//탈퇴여부
	
	@Past
	private Date joinDate;			//가입날짜

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getQuit() {
		return quit;
	}

	public void setQuit(String quit) {
		this.quit = quit;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public User(Integer id, String nickname, String account_type, String account_id, String quit, Date joinDate) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.account_type = account_type;
		this.account_id = account_id;
		this.quit = quit;
		this.joinDate = joinDate;
	}
	

	
	
}
