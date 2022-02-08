package com.sole.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sole.springBoot.service.MemberService;

@Controller
public class MemberController {
	
	//private final MemberService memberService = new MemberService(); 이러면 다른 여러 컨트롤러들이 멤머컨트롤러를 가져다 쓸 수 있다.
	
	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	
	

}
