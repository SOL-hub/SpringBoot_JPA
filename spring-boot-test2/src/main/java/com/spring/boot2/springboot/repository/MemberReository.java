package com.spring.boot2.springboot.repository;

import java.util.List;
import java.util.Optional;

import com.spring.boot2.springboot.domain.Member;


public interface MemberReository {Member save(Member member); //save하여 회원이 저장소에 저장됨
Optional<Member> findById(Long id); //id를 찾기
Optional<Member> findByName(String name); //name을 찾기
List<Member> findAll();//모든 회원 list를 반환

//Optional이란?
//Optional은 java8에 들어간 기능
//findById와 findByName를 가져오는데 null일 수 있고 null이면 null을 반환하는데 optional로 감싸서 반환함.


}
