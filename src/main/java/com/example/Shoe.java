package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Shoe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int shoeID;
	@Column
	String shoeName;
	int price; 

}
