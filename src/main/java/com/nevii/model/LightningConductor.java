package com.nevii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class LightningConductor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_lightningConductor;
	
	@NotEmpty
	private String lightningRod;
	@NotEmpty
	private String lightningRodProbe;
	@NotEmpty
	private String lightningRodFunct;
	
	public Long getId_lightningConductor() {
		return id_lightningConductor;
	}
	public String getLightningRod() {
		return lightningRod;
	}
	public String getLightningRodFunct() {
		return lightningRodFunct;
	}
	public String getLightningRodProbe() {
		return lightningRodProbe;
	}

	public void setLightningRod(String lightningRod) {
		this.lightningRod = lightningRod;
	}
	public void setId_lightningConductor(Long id_lightningConductor) {
		this.id_lightningConductor = id_lightningConductor;
	}
	public void setLightningRodFunct(String lightningRodFunct) {
		this.lightningRodFunct = lightningRodFunct;
	}
	public void setLightningRodProbe(String lightningRodProbe) {
		this.lightningRodProbe = lightningRodProbe;
	}

	

}
