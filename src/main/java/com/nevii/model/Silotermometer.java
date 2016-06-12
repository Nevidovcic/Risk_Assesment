package com.nevii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Silotermometer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_silotermometer;
	
	@NotEmpty
	private String siloThermometer;
	@NotEmpty
	private String readingSiloThermometer;
	@NotEmpty
	private String controlSiloThermometer;//kontrola silotermometara
	@NotEmpty
	private String controlSiloThermometerSatisfies;
	
	public String getControlSiloThermometer() {
		return controlSiloThermometer;
	}
	public String getControlSiloThermometerSatisfies() {
		return controlSiloThermometerSatisfies;
	}
	public Long getId_silotermometer() {
		return id_silotermometer;
	}
	public String getReadingSiloThermometer() {
		return readingSiloThermometer;
	}
	public String getSiloThermometer() {
		return siloThermometer;
	}
	public void setControlSiloThermometer(String controlSiloThermometer) {
		this.controlSiloThermometer = controlSiloThermometer;
	}
	public void setControlSiloThermometerSatisfies(String controlSiloThermometerSatisfies) {
		this.controlSiloThermometerSatisfies = controlSiloThermometerSatisfies;
	}
	public void setId_silotermometer(Long id_silotermometer) {
		this.id_silotermometer = id_silotermometer;
	}
	public void setReadingSiloThermometer(String readingSiloThermometer) {
		this.readingSiloThermometer = readingSiloThermometer;
	}
	public void setSiloThermometer(String siloThermometer) {
		this.siloThermometer = siloThermometer;
	}

}
