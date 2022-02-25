package com.sole.JPAStudy.Repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.sole.JPAStudy.domain.Item;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

	private final EntityManager em;
	
	public ItemRepository(EntityManager em) {
		super();
		this.em = em;
	}

	public void save(Item item) {
		if(item.getId() == null) {
			em.persist(item);
			
		}else {
			em.merge(item); //강제 업데이트 
		}
	}
	
	public Item findOne(Long id) {
		return em.find(Item.class, id);
	}
	
	public List<Item> findAll(){
		return em.createQuery("select i from Item i", Item.class).getResultList();
	}
}
