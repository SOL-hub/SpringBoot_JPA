package hello.hellospringrepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import hello.hellospring.domain.Member;

public class MemoryMemberRepository implements MemberRepository {
	
	//저장을 어딘가 해놔야한다. 
	private static Map<Long, Member> store = new HashMap<>();
	private static long sequence = 0L; // 0,1,2키 값을 생성해주는 시퀀스
	

	@Override
	public Member save(Member member) {
		member.setId(++sequence);//store에 넣기 젆에 id값을 셋팅해주고 
		store.put(member.getId(), member); //store에다 저장
		return member;//저장한 거 반환
	}

	@Override
	public Optional<Member> findById(Long id) {
		//return store.get(id);
		//근데 결과가 null이면 어떻게 할 것인가? null인데
		//요즘에는 null이 반환된다면 옵션널로 감싸줘서 반환해준다.
		return Optional.ofNullable(store.get(id));
	}

	@Override
	public Optional<Member> findByName(String name) {
		return store.values().stream().filter(member -> member.getName().equals(name)) //루프로 돌리면서 같은 경우면 필터링되어 반환됨.
		.findAny();
	}

	@Override
	public List<Member> findAll() {
		return new ArrayList<>(store.values());
	}

}
