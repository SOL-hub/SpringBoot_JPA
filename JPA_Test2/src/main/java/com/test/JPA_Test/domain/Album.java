package com.test.JPA_Test.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="dtype")
@DiscriminatorValue("A")
//@Data
public class Album extends Item{

	private String artist;
	private String etc;
}
