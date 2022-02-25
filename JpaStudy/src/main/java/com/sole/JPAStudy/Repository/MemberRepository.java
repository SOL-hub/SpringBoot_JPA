package com.sole.JPAStudy.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sole.JPAStudy.domain.Member;

@Repository
public class MemberRepository {

	@PersistenceContext
	private EntityManager em;
	
	public void save(Member member) {
		em.persist(member);
	}
	
	public Member findOne(Long id) {
		return em.find(Member.class, id);
	}
	
	public List<Member> findAll(){
		return em.createQuery("select m from Member m", Member.class).getResultList();
	}
	
	public List<Member> findMembers(String name){
		return em.createQuery("select m from Member m where m.name", Member.class).setParameter("name", name).getResultList();
	}
	
}
