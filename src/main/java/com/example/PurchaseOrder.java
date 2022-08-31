package com.example;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class PurchaseOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int orderID;
	@Column
	private String customerName;
	private String ccNum;
	private String email;
	private String shipping;
	private int qty;
	private int size; 
	@CreationTimestamp
	private LocalDate orderDate; 

}