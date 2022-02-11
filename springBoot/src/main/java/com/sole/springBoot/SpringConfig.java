package com.sole.springBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sole.springBoot.repository.MemberRepository;
import com.sole.springBoot.repository.MemoryMemberRepository;
import com.sole.springBoot.service.MemberService;

@Configuration
public class SpringConfig {

	@Bean
	 public MemberService memberService() {
	 return new MemberService(memberRepository());
	 }
	 @Bean
	 public MemberRepository memberRepository() {
	return new MemoryMemberRepository();
	 }
}
