package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jpabook.jpashop.domain.item.Item;

public class Category {
	
	@Id @GeneratedValue
	@Column(name="category_id")
	private Long id;
	
	private String name;
	
	@ManyToMany
	@JoinTable(name="category_item", 
		joinColumns = @JoinColumn(name = "category_id"), 
		inverseJoinColumns = @JoinColumn(name="item_id"))  
	private List<Item> items = new ArrayList<>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="paret_id")
	private Category parent;
	
	@OneToMany(mappedBy= "parent")
	private List<Category> child = new ArrayList<>();
	
	public void addChildCategory(Category child) {
		this.child.add(child);
	//	child.setParent(this);
	}

}
