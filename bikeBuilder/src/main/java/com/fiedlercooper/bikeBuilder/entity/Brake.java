package com.fiedlercooper.bikeBuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "brake_table")
public class Brake {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "brand", nullable = false, length = 50)
	private String brand;
	
	@Column(name = "model", nullable = false, length = 50)
	private String model;
	
	@Column(name = "cost", nullable = false, length = 10)
	private Float cost;
	
}