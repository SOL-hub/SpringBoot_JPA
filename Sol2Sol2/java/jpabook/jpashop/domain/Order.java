package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {



	@Id @GeneratedValue
	@Column(name = "order_id")
	private Long id;
	
	
	//Member와 Order는 다대일 관계이기에
	@ManyToOne//(fetch = LAZY)
	@JoinColumn(name="member_id")
	private Member member;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<OrderItem> orderItems = new ArrayList<>();
	
	@OneToOne//(fetch = LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "delivery_id")
	@JoinColumn
	private Delivery delivery;
	
	private LocalDataTime orderDate;
	
	private OrderStatus status; //주문상태 [order, cancel]
	
	//연관관계 메서드//
	public void setMember(Member member) {
		this.member=member;
		member.getOrders().add(this);
	}
	
	public static void main(String[] args) {
		Member member = new Member();
		Order order = new Order();
		
		member.getOrders().add(order);
		order.setMember(member);
	}
}
