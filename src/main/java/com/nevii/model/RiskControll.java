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
public class RiskControll{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_riskControll;
	
	@NotEmpty
	private String categoriesOfFireRisk;//kategorija ugrozenosti
	@NotEmpty
	private String planOfFireProtec;//plan zastite
	@NotEmpty
	private String regulationOfFelding;//mesta privremenog zavarivanja
	
	@NotEmpty
	private String trainingEmployers;//obuka zapolesnih
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_controls")
	@Valid
	private Controls controls;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_silotermometer")
	@Valid
	private Silotermometer silotermometer;
	
	@NotEmpty
	private String storageBottleUnderPress;//skladistenje boca pod pritiskom
	@NotEmpty
	private String forklift;//viljuskar
	@NotEmpty
	private String smokingProhibition;//zabrana pusenja
	@NotEmpty
	private String cleanliness;//cistoca
	
	private String markRiskControls;
	
	public String getCategoriesOfFireRisk() {
		return categoriesOfFireRisk;
	}
	
	public String getCleanliness() {
		return cleanliness;
	}
	
	public Controls getControls() {
		return controls;
	}
	
	public String getForklift() {
		return forklift;
	}
	
	public Long getId_riskControll() {
		return id_riskControll;
	}
	public String getMarkRiskControls() {
		return markRiskControls;
	}
	public String getPlanOfFireProtec() {
		return planOfFireProtec;
	}
	public String getRegulationOfFelding() {
		return regulationOfFelding;
	}
	

	public Silotermometer getSilotermometer() {
		return silotermometer;
	}
	
	
	public String getSmokingProhibition() {
		return smokingProhibition;
	}
	public String getStorageBottleUnderPress() {
		return storageBottleUnderPress;
	}
	public String getTrainingEmployers() {
		return trainingEmployers;
	}
	public void setCategoriesOfFireRisk(String categoriesOfFireRisk) {
		this.categoriesOfFireRisk = categoriesOfFireRisk;
	}
	public void setCleanliness(String cleanliness) {
		this.cleanliness = cleanliness;
	}
	public void setControls(Controls controls) {
		this.controls = controls;
	}
	public void setForklift(String forklift) {
		this.forklift = forklift;
	}
	
	public void setId_riskControll(Long id_riskControll) {
		this.id_riskControll = id_riskControll;
	}
	
	public void setMarkRiskControls(String markRiskControls) {
		this.markRiskControls = markRiskControls;
	}
	public void setPlanOfFireProtec(String planOfFireProtec) {
		this.planOfFireProtec = planOfFireProtec;
	}
	public void setRegulationOfFelding(String regulationOfFelding) {
		this.regulationOfFelding = regulationOfFelding;
	}

	
	public void setSilotermometer(Silotermometer silotermometer) {
		this.silotermometer = silotermometer;
	}
	
	public void setSmokingProhibition(String smokingProhibition) {
		this.smokingProhibition = smokingProhibition;
	}
	public void setStorageBottleUnderPress(String storageBottleUnderPress) {
		this.storageBottleUnderPress = storageBottleUnderPress;
	}
	public void setTrainingEmployers(String trainingEmployers) {
		this.trainingEmployers = trainingEmployers;
	}
	
	
	

}
