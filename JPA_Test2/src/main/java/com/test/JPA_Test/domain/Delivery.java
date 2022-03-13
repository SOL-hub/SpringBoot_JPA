package com.test.JPA_Test.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Delivery {

	@Id
	@GeneratedValue
	@Column(name="delivery_id")
	
	private Long id;
	
	private Order order;
	
	@Embedded
	private Address address;
	
	@Enumerated(EnumType.STRING)
	private DeliveryStatus status; //READY, COMP
}
