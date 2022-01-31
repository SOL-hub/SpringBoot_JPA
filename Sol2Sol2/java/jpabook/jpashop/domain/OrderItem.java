package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import jpabook.jpashop.domain.item.Item;



@Entity//JPA에 관리할 객체를 선언한
public class OrderItem {
	@Id//객체의 primary key를 의미한다. JPA는 이 id를 통해 객체를 구분한다.
	@GeneratedValue
	@Column(name = "order_item_id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="item_id")
	private Item item;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="order_id")
	private Order order;
	
	private int orderPrice;//주문가격
	private int count; //주문수량
}
