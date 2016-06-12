package com.nevii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class FireFightingIns {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_fireFightingIns;
	
	@NotEmpty
	private String fireFigtingInstal;
	@NotEmpty
	private String fireFigtingInstProbe;
	@NotEmpty
	private String fireFigtingInstFunct;

	public String getFireFigtingInstal() {
		return fireFigtingInstal;
	}
	public String getFireFigtingInstFunct() {
		return fireFigtingInstFunct;
	}
	public String getFireFigtingInstProbe() {
		return fireFigtingInstProbe;
	}
	public Long getId_fireFightingIns() {
		return id_fireFightingIns;
	}

	public void setFireFigtingInstal(String fireFigtingInstal) {
		this.fireFigtingInstal = fireFigtingInstal;
	}
	public void setFireFigtingInstFunct(String fireFigtingInstFunct) {
		this.fireFigtingInstFunct = fireFigtingInstFunct;
	}
	public void setFireFigtingInstProbe(String fireFigtingInstProbe) {
		this.fireFigtingInstProbe = fireFigtingInstProbe;
	}
	public void setId_fireFightingIns(Long id_fireFightingIns) {
		this.id_fireFightingIns = id_fireFightingIns;
	}
	

}
