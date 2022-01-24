package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;
import hello.hellospringrepository.MemberRepository;
import hello.hellospringrepository.MemoryMemberRepository;

public class MemoryMemberRepositoryTest {
	
	//MemberRepository repository = new MemoryMemberRepository(); 
	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	@AfterEach
	public void afterEach() {
		repository.clearStore(); //test가 실행되고 끝낼 때 이거 실행하도록 깔끔하게 지워줘야 문제가 없다.
	}
	
	@Test
	//저장했던 거 확인해보기
	public void save() {
		Member member = new Member();
		member.setName("Spring");
		
		repository.save(member);
		
		Member result = repository.findById(member.getId()).get(); //아이디 꺼내고 검증하기
		//System.out.println("result="+(result = member)); //같는지 출력해보기
		
		//member랑 result가 같은지보기.
		//다른 방법 Assertions
		
		//Assertions.assertThat(member).isEqualTo(result);//저장한 멤버가 find에서 했을 때 튀어나오게
		//assertThat(result).isEqualTo(member);
		//import org.assertj.core.api.Assertions;를 import하면 두번째 코드로 간단하게 사용할 수 있다.
	}
	
	@Test
	//이름 찾는 거 TEST
	public void findByName() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("Spring2");
		repository.save(member2);
		
		Member result = repository.findByName("spring1").get();
		
		assertThat(result).isEqualTo(member1);
		}
	
	@Test
	public void findAll() {
		Member member1 = new Member();
		member1.setName("spring");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		repository.save(member2);
		
		List<Member> result = repository.findAll();
		
		assertThat(result.size()).isEqualTo(2);
	}
	
}
