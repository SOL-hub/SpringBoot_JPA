package com.test.JPA_Test.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item {
	
	private String artist;
	private String isbn;

	
}
