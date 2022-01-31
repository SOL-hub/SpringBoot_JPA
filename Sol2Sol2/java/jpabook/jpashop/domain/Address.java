package jpabook.jpashop.domain;

import javax.persistence.Embeddable;

@Embeddable //어딘가 내장이될 수 있다.
public class Address {

	private String city;
	private String street;
	private String zipcode;
	
	protected Address() {
	}
	
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public String getZipcode() {
		return zipcode;
	}
	
	
}


