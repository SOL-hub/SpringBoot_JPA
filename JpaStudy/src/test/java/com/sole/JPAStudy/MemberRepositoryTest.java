package com.sole.JPAStudy;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.sole.JPAStudy.domain.Member;


@SpringBootTest
public class MemberRepositoryTest {
	
	@Autowired MemberReposirtory memberReposirtory;
	
	@Test
	@Transactional
	@Rollback(false)
	public void testMember() throws Exception{
		Member member = new Member();
		member.setUsername("memberA");
		
		Long savedId = memberReposirtory.save(member);
		
		Member findMember = memberReposirtory.find(savedId);
		
		Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
		Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
				}

}
