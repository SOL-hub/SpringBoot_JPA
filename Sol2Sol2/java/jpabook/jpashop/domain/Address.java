package jpabook.jpashop.domain;

import javax.persistence.Embeddable;

@Embeddable //어딘가 내장이될 수 있다.
public class Address {

	private String city;
	private String street;
	private String zipcode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}


