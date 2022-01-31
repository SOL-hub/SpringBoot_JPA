package jpabook.jpashop.domain.item;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Order;

@Entity
public class Delivery {
	
		@Id @GeneratedValue
		@Column(name="delivery_id")
		private Long id;
		
		@OneToOne
		private Order order;
		
		@Embedded
		private Address address;

		@Enumerated(EnumType.STRING)
		private DeliveyStatus status; //Ready, Comp
}
