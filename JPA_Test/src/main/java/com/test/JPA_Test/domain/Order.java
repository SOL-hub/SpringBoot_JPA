package com.test.JPA_Test.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private Long id;
	
	@ManyToOne//연관관계의 주인
	@JoinColumn(name="member_id")
	private Member member;
	
	@OneToMany(mappedBy = "order") //order에 의해서 매핑이 됨
	private List<OrderItem> orderItems = new ArrayList<>();
	
	@OneToOne
	private Delivery delivery;
	
	private Date date;
	
	private LocalDateTime orderDate;
	
	private OrderStatus status; //주문 선택 [Order, CANCEL]
	
}
