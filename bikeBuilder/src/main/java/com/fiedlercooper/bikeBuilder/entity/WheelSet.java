package com.fiedlercooper.bikeBuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

// WHEEL SET ENTITY WITH ID, BRAND, MODEL, AND COST

@Data
@Entity
@Table(name = "wheel_set_table")
public class WheelSet {
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