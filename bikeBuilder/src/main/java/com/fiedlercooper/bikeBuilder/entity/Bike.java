package com.fiedlercooper.bikeBuilder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name = "bike_build_table")
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinTable(name = "bike_frame", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "frame_id") })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Frame bikeFrame;

	@ManyToOne
	@JoinTable(name = "bike_fork", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "fork_id") })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Fork bikeFork;

	@ManyToOne
	@JoinTable(name = "bike_brakes", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "brake_id") })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Brake bikeBrake;

	@ManyToOne
	@JoinTable(name = "bike_drive_train", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "drive_train_id") })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private DriveTrain bikeDriveTrain;

	@ManyToOne
	@JoinTable(name = "bike_wheel_set", joinColumns = { @JoinColumn(name = "bike_id") }, inverseJoinColumns = {
			@JoinColumn(name = "wheel_set_id") })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private WheelSet bikeWheelSet;

}
