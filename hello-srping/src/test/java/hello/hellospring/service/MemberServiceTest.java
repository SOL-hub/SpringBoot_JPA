//package hello.hellospring.service;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import hello.hellospring.domain.Member;
//import hello.hellospringrepository.MemoryMemberRepository;
//
//public class MemberServiceTest {
//	
//	MemberService memberService = new MemberService();
//	
//	MemoryMemberRepository memberRepository = new MemoryMemberRepository();
//	
//	@BeforeEach
//	public void beforeEach() {
//		memberRepository = new MemoryMemberRepository();
////		memberService = new MemberService(memberRepository);
//	}
//	
//	@AfterEach
//	public void afterEach() {
//		memberRepository.clearStore();
//	}
//	
//	
//	@Test
//	void 회원가입() throws Exception {
//		//given
//		Member member = new Member();
//		member.setName("hello");
//		
//		//when
//		Long saveId = memberService.join(member);
//		
//		
//		//then(검증)
//		
//		//리포지터리에 저장된 것이 맞아? 라고 검증을 해야한다
//		Member findMember = memberRepository.findById(saveId).get();
//		//Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
//		
//	}
//	
//	@Test
//	void 중복_회원_예외() throws Exception{
//		//given
//		Member member1 = new Member();
//		member1.setName("spring");
//		
//		Member member2 = new Member();
//		member2.setName("spirng");
//		
//		//when
//		memberService.join(member1);
////		 IllegalStateException e = assertThrows(IllegalStateException.class,
////		 () -> memberService.join(member2));//예외가 발생해야 한다.
////		 assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//		
//		/*try {
//			memberService.join(member2);
//			fail();
//		}catch(IllegalStateException e) {
//			assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//		}*/
//		
//		//then
//	}
//
//	
//}
