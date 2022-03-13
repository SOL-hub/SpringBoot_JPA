package com.test.JPA_Test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
//@Data
public class OrderItem {

	@Id
	@GeneratedValue
	@Column(name="order_item_id")
	private Long id;
	private Item item;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	private int orderPrice; //주문 가격
	private int count; //주문 수량
}
