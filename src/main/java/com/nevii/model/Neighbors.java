package com.nevii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Neighbors {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_neighbors;
	
	@NotEmpty
	private String neighborsPresence;
	@NotEmpty
	private String neighborsActivity;
	
	public Neighbors() {
		super();
	}
	public Long getId_neighbors() {
		return id_neighbors;
	}
	
	public String getNeighborsActivity() {
		return neighborsActivity;
	}
	public String getNeighborsPresence() {
		return neighborsPresence;
	}
	
	public void setId_neighbors(Long id_neighbors) {
		this.id_neighbors = id_neighbors;
	}
	public void setNeighborsActivity(String neighborsActivity) {
		this.neighborsActivity = neighborsActivity;
	}
	public void setNeighborsPresence(String neighborsPresence) {
		this.neighborsPresence = neighborsPresence;
	}
	
	
}
