package com.spring.boot2.springboot.service;

import java.util.List;
import java.util.Optional;

import com.spring.boot2.springboot.domain.Member;
import com.spring.boot2.springboot.repository.MemberReository;


public class MemerService {

	//서비스를 만들려면 먼저 리포지토리가 있어야한다.
	
		private final MemberReository memberRepository;
		
		
//		@Autowired
		public MemerService(MemberReository memberRepository) {
			this.memberRepository = memberRepository;
		}
		
		public Long join(Member member) {
			//같은 이름이 있는 중복 회원 X
			
			//Optional<Member> result = memberRepository.findByName(member.getName());
			//result.ifPresent(m -> {
			//	throw new IllegalStateException("이미 존재하는 회원입니다.");
			//});
			
			
			//memberRepository.save(member);
			//return member.getId();
			
			//Optional를 바로 반환하는 것은 권장하지 않는다. 따라서.
			
			validateDuplicateMember(member); //중복회원검증
			memberRepository.save(member);
			return member.getId();
		}
		
		private void validateDuplicateMember(Member member) {
			memberRepository.findByName(member.getName())
			.ifPresent(m->{throw new IllegalStateException("이미 존재하는 회원입니다.");
			
		});
			
	}
		/*전체 회원 조회*/
		public List<Member> findMembers(){
			return memberRepository.findAll();
		}
		
		public Optional<Member> findOne(Long memberId){
			return memberRepository.findById(memberId);
		}
	}