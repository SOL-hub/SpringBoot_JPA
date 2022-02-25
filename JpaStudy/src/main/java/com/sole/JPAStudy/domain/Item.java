package com.sole.JPAStudy.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.sole.JPAStudy.exception.NotnoughStockException;

@Entity

public abstract class Item {

	@Id @GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	private String name;
	private int price;
	private int stockQuantity;
	
	@ManyToMany(mappedBy = "items")
	private List<Category> categories = new ArrayList<>();
	
	//비즈니스 로직//
	public void addStrock(int quanitity) {
		this.stockQuantity += quanitity;
		
	}
	
	//stock감소
	public void removeStock(int quantity) {
		int restStock = this.stockQuantity - quantity;
		if(restStock < 0) {
			throw new NotnoughStockException("need more stock");
		}
		this.stockQuantity = restStock;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
