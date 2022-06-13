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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "wheel_sizes")
public class WheelSizes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "size", unique = true)
	private String size;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "wheel_sizes_forks", joinColumns = { @JoinColumn(name = "wheel_size_id") }, inverseJoinColumns = {
			@JoinColumn(name = "fork_id") })
	private List<Fork> forks;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name = "wheel_sizes_wheel_sets", joinColumns = { @JoinColumn(name = "wheel_size_id") }, inverseJoinColumns = {
			@JoinColumn(name = "wheel_set_id") })
	private List<WheelSet> wheelSets;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "wheel_sizes_frames", joinColumns = {
			@JoinColumn(name = "wheel_size_id") }, inverseJoinColumns = { @JoinColumn(name = "frame_id") })
	private List<Frame> frames;

	public void setAdditionalFrames(Frame newframe) {
		this.frames.add(newframe);
	}

	public void setAdditionalForks(Fork newFork) {
		this.forks.add(newFork);
		
	}

}
