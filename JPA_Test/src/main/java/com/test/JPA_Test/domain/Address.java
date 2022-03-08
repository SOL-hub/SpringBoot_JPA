package com.test.JPA_Test.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String city;
	private String street;
	private String zipcode;
	
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
