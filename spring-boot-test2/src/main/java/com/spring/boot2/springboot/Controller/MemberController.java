package com.spring.boot2.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.boot2.springboot.domain.Member;
import com.spring.boot2.springboot.service.MemerService;

@Controller
public class MemberController {

	private MemerService memberService;
	
	@Autowired
	public MemberController(MemerService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/members/new")
		public String createForm() {
			return "members/createMemberForm";
		}
	
	@PostMapping
	public String create(MemberForm form) {
		Member member = new Member();
		member.setName((form.getName()));
		
		memberService.join(member);
		
		return "redirect:/";
	}
	
	@GetMapping("members")
	public String list(Model model) {
		List<Member> members = memberService.findMembers();
		model.addAttribute("members", members);
		return "members/memberList";
	}
}
