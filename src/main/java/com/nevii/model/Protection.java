package com.nevii.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Protection{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_protection;
	
	@NotEmpty
	private String fenced;
	@NotEmpty
	private String illuminated;
	@NotEmpty
	private String fireBrigade;
	@NotEmpty
	private String security;
	@NotEmpty
	private String fireProtectionMan;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_hydrant")
	@Valid
	private Hydrant hydrant;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_extinguisher")
	@Valid
	private FireExtinguisher fireExtinguisher;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_lightningConductor")
	@Valid
	private LightningConductor lightningConductor;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_fireAlarm")
	@Valid
	private FireAlarm fireAlarm;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_fireFightingIns")
	@Valid
	private FireFightingIns fireFightingIns;


	@NotEmpty
	private String theftSystem;

	@NotEmpty
	private String videoSurve;

	private String mark;
	
	public Protection() {
		super();
	}


	public String getFenced() {
		return fenced;
	}


	public FireAlarm getFireAlarm() {
		return fireAlarm;
	}


	public String getFireBrigade() {
		return fireBrigade;
	}


	public FireExtinguisher getFireExtinguisher() {
		return fireExtinguisher;
	}
	public FireFightingIns getFireFightingIns() {
		return fireFightingIns;
	}
	
	public String getFireProtectionMan() {
		return fireProtectionMan;
	}
	
	public Hydrant getHydrant() {
		return hydrant;
	}
	public Long getId_protection() {
		return id_protection;
	}
	
	public String getIlluminated() {
		return illuminated;
	}
	
	
	public LightningConductor getLightningConductor() {
		return lightningConductor;
	}
	
	public String getMark() {
		return mark;
	}
	
	
	public String getSecurity() {
		return security;
	}
	public String getTheftSystem() {
		return theftSystem;
	}
	public String getVideoSurve() {
		return videoSurve;
	}
	
	public void setFenced(String fenced) {
		this.fenced = fenced;
	}
	
	public void setFireAlarm(FireAlarm fireAlarm) {
		this.fireAlarm = fireAlarm;
	}
	
	public void setFireBrigade(String fireBrigade) {
		this.fireBrigade = fireBrigade;
	}
	public void setFireExtinguisher(FireExtinguisher fireExtinguisher) {
		this.fireExtinguisher = fireExtinguisher;
	}
	
	public void setFireFightingIns(FireFightingIns fireFightingIns) {
		this.fireFightingIns = fireFightingIns;
	}
	public void setFireProtectionMan(String fireProtectionMan) {
		this.fireProtectionMan = fireProtectionMan;
	}
	
	public void setHydrant(Hydrant hydrant) {
		this.hydrant = hydrant;
	}

	public void setId_protection(Long id_protection) {
		this.id_protection = id_protection;
	}


	public void setIlluminated(String illuminated) {
		this.illuminated = illuminated;
	}


	public void setLightningConductor(LightningConductor lightningConductor) {
		this.lightningConductor = lightningConductor;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public void setSecurity(String security) {
		this.security = security;
	}
	public void setTheftSystem(String theftSystem) {
		this.theftSystem = theftSystem;
	}
	public void setVideoSurve(String videoSurve) {
		this.videoSurve = videoSurve;
	}
	

}
