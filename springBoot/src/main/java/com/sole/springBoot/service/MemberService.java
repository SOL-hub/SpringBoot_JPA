package com.sole.springBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sole.springBoot.domain.Member;
import com.sole.springBoot.repository.MemberRepository;
import com.sole.springBoot.repository.MemoryMemberRepository;

@Service
public class MemberService {
	
	//private final MemberRepository memberRepository = new MemoryMemberRepository();
	private final MemberRepository memberRepository;
	
	//외부에서 넣어주도록 바꿔주자.
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository=memberRepository;
	}
	
	//회원가입
	public Long join(Member member) {
		
		//같은 이름이 있는 중복 회원은 안돼
		validateDuplicateMember(member); //중복회원 검증하고
		
		memberRepository.save(member); //검증 후 저장
		return member.getId();
		
		//회원가입하면 아이디를 반환해주겠다.
		//근데 같은 이름이 있는 회원은 안된다.
		
	}

	private void validateDuplicateMember(Member member) {
		memberRepository.findByName(member.getName())
		.ifPresent(m -> {
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		});
	}
	
	public List<Member> findMembers(){
		return memberRepository.findAll();
		
	}
	
	public Optional<Member> findOne(Long memberId){
		return memberRepository.findById(memberId);
	}
}
