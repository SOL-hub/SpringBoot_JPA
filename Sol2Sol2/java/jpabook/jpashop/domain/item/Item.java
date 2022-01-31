package jpabook.jpashop.domain.item;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import jpabook.jpashop.domain.Category;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item {
	@Id @GeneratedValue
	 @Column(name = "item_id")
	 private Long id;
	 private String name;
	 
	 private int price;
	 private int stockQuantity;
	 
	 
	 private List<Category> categroyies = new ArrayList<>();
	 
	 
	//setter getter
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	 
	
	
	 
	 
	 
}
