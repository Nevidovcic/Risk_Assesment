package com.nevii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class FireExtinguisher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_extinguisher;
	
	@NotEmpty
	private String fireExting;
	@NotEmpty
	private String fireExtingNumb;
	@NotEmpty
	private String fireExtingProbe;

	public String getFireExting() {
		return fireExting;
	}
	public String getFireExtingNumb() {
		return fireExtingNumb;
	}
	public String getFireExtingProbe() {
		return fireExtingProbe;
	}
	public Long getId_extinguisher() {
		return id_extinguisher;
	}

	public void setFireExting(String fireExting) {
		this.fireExting = fireExting;
	}
	public void setFireExtingNumb(String fireExtingNumb) {
		this.fireExtingNumb = fireExtingNumb;
	}
	public void setFireExtingProbe(String fireExtingProbe) {
		this.fireExtingProbe = fireExtingProbe;
	}
	public void setId_extinguisher(Long id_extinguisher) {
		this.id_extinguisher = id_extinguisher;
	}

}
