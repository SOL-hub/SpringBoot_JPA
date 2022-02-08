package com.sole.springBoot.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sole.springBoot.domain.Member;
import com.sole.springBoot.repository.MemoryMemberRepository;

public class MemberServiceTest {

	MemberService memberService;
	MemoryMemberRepository memberRepository = new MemoryMemberRepository();
	
	@BeforeEach
	public void beforeEach() {
		memberRepository = new MemoryMemberRepository();
		memberService = new MemberService(memberRepository);
	}
	
	@AfterEach
	public void afterEach() {
		memberRepository.clearStore();
	}
	
	@Test
	void 회원가입() {
		Member member = new Member();
		member.setName("hello");
		
		Long saveId = memberService.join(member);
		
		//repository에 있는거 맞아? 라고 찾아야하는 것이다.
		Member findMember = memberService.findOne(saveId).get();
		Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
	}
	
	
	
	@Test
	public void 중복회원예외() {
		Member member1 = new Member();
		member1.setName("spring");
		
		Member member2 = new Member();
		member2.setName("spirng");
		
		memberService.join(member1);
		IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
		
		Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원");
		/*try {
			memberService.join(member2);
			fail();
		} catch(IllegalStateException e) {
			assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
		}*/
		
	}



	private void assertThat(Class<IllegalStateException> class1, Object assertFactory) {
		// TODO Auto-generated method stub
		
	}
		
	}
