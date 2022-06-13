package com.fiedlercooper.bikeBuilder.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "terrain_types")
public class TerrainTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "type", unique = true)
	private String type;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "terrain_types_forks", joinColumns = {
			@JoinColumn(name = "terrain_types_id") }, inverseJoinColumns = { @JoinColumn(name = "fork_id") })
	private List<Fork> forks;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "terrain_types_frames", joinColumns = {
			@JoinColumn(name = "terrain_types_id") }, inverseJoinColumns = { @JoinColumn(name = "frame_id") })
	private List<Frame> frames;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "terrain_types_brakes", joinColumns = {
			@JoinColumn(name = "terrain_types_id") }, inverseJoinColumns = { @JoinColumn(name = "brake_id") })
	private List<Brake> brakes;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "terrain_types_drive_trains", joinColumns = {
			@JoinColumn(name = "terrain_types_id") }, inverseJoinColumns = { @JoinColumn(name = "drive_train_id") })
	private List<DriveTrain> driveTrains;
	
	public void setAdditionalFrames(Frame newframe) {
		this.frames.add(newframe);
	}

	public void setAdditionalForks(Fork newFork) {
		this.forks.add(newFork);
		
	}
	
}