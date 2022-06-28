package com.fiedlercooper.bikeBuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

// DRIVE TRAIN  ENTITY WITH ID, BRAND, MODEL, GEAR COUNT, AND COST

@Data
@Entity
@Table(name = "drive_train_table")
public class DriveTrain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "brand", nullable = false, length = 50)
	private String brand;
	
	@Column(name = "model", nullable = false, length = 50)
	private String model;
	
	@Column(name = "gear_count", nullable = false, length = 2)
	private Integer gears;
	
	@Column(name = "cost", nullable = false, length = 10)
	private Float cost;
	
}
