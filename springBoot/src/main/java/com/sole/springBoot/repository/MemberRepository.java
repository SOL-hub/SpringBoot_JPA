package com.sole.springBoot.repository;

import java.util.List;
import java.util.Optional;

import com.sole.springBoot.domain.Member;

public interface MemberRepository {
	Member save(Member member); //저장
	//옵셔널은 null처리할 때 유용 
	//저장된 아이디, 비밀번호로 찾는다.
	Optional<Member> findById(Long id);
	Optional<Member> findByName(String name);
	List<Member> findAll();
	

}
