package com.sole.JPAStudy.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public abstract class Item {

	@Id @GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	private String name;
	private int price;
	private int stockQuantity;
	
	private List<Category> categories = new ArrayList<>();
}