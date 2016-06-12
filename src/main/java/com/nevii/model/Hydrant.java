package com.nevii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Hydrant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_hydrant;

	@NotEmpty
	private String hydrants;
	@NotEmpty
	private String hydrantsPressure;
	@NotEmpty
	private String hydrantsCabAffordable;
	@NotEmpty
	private String hydrantsCabEqquiped;
	
	public String getHydrants() {
		return hydrants;
	}
	public String getHydrantsCabAffordable() {
		return hydrantsCabAffordable;
	}
	
	public String getHydrantsCabEqquiped() {
		return hydrantsCabEqquiped;
	}
	public String getHydrantsPressure() {
		return hydrantsPressure;
	}
	public Long getId_hydrant() {
		return id_hydrant;
	}

	public void setHydrants(String hydrants) {
		this.hydrants = hydrants;
	}
	public void setHydrantsCabAffordable(String hydrantsCabAffordable) {
		this.hydrantsCabAffordable = hydrantsCabAffordable;
	}
	public void setHydrantsCabEqquiped(String hydrantsCabEqquiped) {
		this.hydrantsCabEqquiped = hydrantsCabEqquiped;
	}
	public void setHydrantsPressure(String hydrantsPressure) {
		this.hydrantsPressure = hydrantsPressure;
	}
	public void setId_hydrant(Long id_hydrant) {
		this.id_hydrant = id_hydrant;
	}

}
