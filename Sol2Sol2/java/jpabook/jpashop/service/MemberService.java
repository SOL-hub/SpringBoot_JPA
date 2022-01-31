package jpabook.jpashop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;

@Service
@Transactional //데이터 변경하는거할 때 트랜잭션있어야한다.
public class MemberService {
	
	private MemberRepository memberRepository;
	
	@Autowired
	public void setMemberRepository(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	@Transactional
	//회원가입
	public long join(Member member) {
		
		validateDuplicateMember(member);//중복회원검증
		memberRepository.save(member);
		return member.getId();
	}
	
	private void validateDuplicateMember(Member member) {
		List<Member> findMembers = memberRepository.flindByName(member.getName());
		if(!findMembers.isEmpty()) {
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		}
	}
	
	//회원 전체 조회
	public List<Member> findMembers(){
		return memberRepository.findAll();
	}
	
	//단건 조회
	public Member findOne(Long memberId) {
		return memberRepository.findOne(memberId);
	}

}
