package com.nevii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Controls {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_controls;
	
	@NotEmpty
	private String controlOfElectrInst;//kontrola elektro instalacija
	@NotEmpty
	private String controlOfElectrInstSatisfies;
	@NotEmpty
	private String controlOfPropanButanInst;//kontrola propan butan
	@NotEmpty
	private String controlOfPropanButanInstSatisfies;
	@NotEmpty
	private String controlOfGasInst;//kontrola gasnih instalacija
	@NotEmpty
	private String controlOfGasInstSatisfies;
	@NotEmpty
	private String controlOfPressureVessel;//kontrola posuda pod pritiskom
	@NotEmpty
	private String controlOfPressureVesselSatisfies;
	@NotEmpty
	private String controlOfBoilerUnderPress;//kontrola kotlova pod pritiskom
	@NotEmpty
	private String controlOfBoilerUnderPressSatisfies;
	@NotEmpty
	private String controlOfSafteyValves;//ventili sigurnosti
	@NotEmpty
	private String controlOfSafteyValvesSatisfies;
	
	public String getControlOfBoilerUnderPress() {
		return controlOfBoilerUnderPress;
	}
	public String getControlOfBoilerUnderPressSatisfies() {
		return controlOfBoilerUnderPressSatisfies;
	}
	public String getControlOfElectrInst() {
		return controlOfElectrInst;
	}
	public String getControlOfElectrInstSatisfies() {
		return controlOfElectrInstSatisfies;
	}
	public String getControlOfGasInst() {
		return controlOfGasInst;
	}
	public String getControlOfGasInstSatisfies() {
		return controlOfGasInstSatisfies;
	}
	public String getControlOfPressureVessel() {
		return controlOfPressureVessel;
	}
	public String getControlOfPressureVesselSatisfies() {
		return controlOfPressureVesselSatisfies;
	}
	public String getControlOfPropanButanInst() {
		return controlOfPropanButanInst;
	}
	public String getControlOfPropanButanInstSatisfies() {
		return controlOfPropanButanInstSatisfies;
	}
	public String getControlOfSafteyValves() {
		return controlOfSafteyValves;
	}
	public String getControlOfSafteyValvesSatisfies() {
		return controlOfSafteyValvesSatisfies;
	}
	public Long getId_controls() {
		return id_controls;
	}
	public void setControlOfBoilerUnderPress(String controlOfBoilerUnderPress) {
		this.controlOfBoilerUnderPress = controlOfBoilerUnderPress;
	}
	public void setControlOfBoilerUnderPressSatisfies(String controlOfBoilerUnderPressSatisfies) {
		this.controlOfBoilerUnderPressSatisfies = controlOfBoilerUnderPressSatisfies;
	}
	public void setControlOfElectrInst(String controlOfElectrInst) {
		this.controlOfElectrInst = controlOfElectrInst;
	}
	public void setControlOfElectrInstSatisfies(String controlOfElectrInstSatisfies) {
		this.controlOfElectrInstSatisfies = controlOfElectrInstSatisfies;
	}
	public void setControlOfGasInst(String controlOfGasInst) {
		this.controlOfGasInst = controlOfGasInst;
	}
	public void setControlOfGasInstSatisfies(String controlOfGasInstSatisfies) {
		this.controlOfGasInstSatisfies = controlOfGasInstSatisfies;
	}
	public void setControlOfPressureVessel(String controlOfPressureVessel) {
		this.controlOfPressureVessel = controlOfPressureVessel;
	}
	public void setControlOfPressureVesselSatisfies(String controlOfPressureVesselSatisfies) {
		this.controlOfPressureVesselSatisfies = controlOfPressureVesselSatisfies;
	}
	public void setControlOfPropanButanInst(String controlOfPropanButanInst) {
		this.controlOfPropanButanInst = controlOfPropanButanInst;
	}
	public void setControlOfPropanButanInstSatisfies(String controlOfPropanButanInstSatisfies) {
		this.controlOfPropanButanInstSatisfies = controlOfPropanButanInstSatisfies;
	}
	public void setControlOfSafteyValves(String controlOfSafteyValves) {
		this.controlOfSafteyValves = controlOfSafteyValves;
	}
	public void setControlOfSafteyValvesSatisfies(String controlOfSafteyValvesSatisfies) {
		this.controlOfSafteyValvesSatisfies = controlOfSafteyValvesSatisfies;
	}
	public void setId_controls(Long id_controls) {
		this.id_controls = id_controls;
	}
	

}
