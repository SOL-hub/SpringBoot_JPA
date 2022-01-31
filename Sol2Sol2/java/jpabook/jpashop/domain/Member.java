package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Member {
	
	@Id @GeneratedValue//시퀀스 값
	@Column(name="member_id")
	private Long id;
	
	private String name;
	
	@Embedded //내장타입쓴다고 어노테이션달기
	private Address address;
	
	
	@OneToMany(mappedBy="member")//연관관계 주인
	//하나의 회원이 여러가지를 주문하기에
	private List<Order> orders = new ArrayList<>();
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
}
