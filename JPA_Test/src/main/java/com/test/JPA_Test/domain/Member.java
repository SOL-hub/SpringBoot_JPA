package com.test.JPA_Test.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Member {
	
	@Id
	@GeneratedValue
	@Column(name="member_id")
	private Long id;
	
	private String name;
	
	@Embedded
	private String address;
	
	@OneToMany(mappedBy = "member") //맵핑된 것
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Member(Long id, String name, String address, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.orders = orders;
	}
	
	

}
