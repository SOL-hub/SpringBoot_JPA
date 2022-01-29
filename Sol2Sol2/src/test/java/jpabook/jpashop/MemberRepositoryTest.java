package jpabook.jpashop;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {
	
	@Autowired MemberRepository memberRepository;

	@Test
	@Transactional
	public void  testmember() throws Exception{
		
		Member member = new Member();
		member.setUsername("memberA");
		
		Long saveId = memberRepository.save(member);
		
		Member findMember = memberRepository.find(saveId);
		
		Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
		Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
		Assertions.assertThat(findMember).isEqualTo(findMember);
		System.out.println("findMember == member:"+ (findMember == member));
	}
}
