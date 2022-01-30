package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id @GeneratedValue
	@Column(name = "order_id")
	private Long id;
	
	private String name;
	
	@Embedded
	private Address address;

	
}
