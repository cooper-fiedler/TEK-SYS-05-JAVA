package com.fiedlercooper.bikeBuilder.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="bike_build_table")
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bike_frame", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "frame_id") })
	private List<Frame> bikeFrameList;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bike_fork", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "fork_id") })
	private List<Fork> bikeForkList;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bike_brakes", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "brake_id") })
	private List<Brake> bikeBrakeList;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bike_drive_train", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "drive_train_id") })
	private List<DriveTrain> bikeDriveTrainList;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bike_wheel_set", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "wheel_set_id") })
	private List<WheelSet> bikeWheelSetList;

}
