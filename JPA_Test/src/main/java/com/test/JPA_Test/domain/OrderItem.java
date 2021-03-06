package com.test.JPA_Test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue
	@Column(name="order_item_id")
	
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	private int orderPrice;
	private int count;
}
