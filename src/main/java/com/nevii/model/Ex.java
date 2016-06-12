package com.nevii.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Ex {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_ex;
	
	@NotEmpty
	private String studyOfDangerosZone;//elaborat o zonama opasnosti
	@NotEmpty
	private String exCertificate;//da li radnici poseduju Ex sertifikat
	@NotEmpty
	private String controlExEquipment;//kotrnola oprema u Ex izvedbi
	@NotEmpty
	private String controlExInstalation;//kontrola instalacija u Ex izvedbi
	@NotEmpty
	private String instalationExGasDetection;//kontrola instalacija Ex gas
	@NotEmpty
	private String controlExGasDetection;//kontrola detekrota gasa
	@NotEmpty
	private String protectionOfElectricalOvervoltage;//zastita od eletricnog praznjenja

	private String markEx;
	
	public String getControlExEquipment() {
		return controlExEquipment;
	}

	public String getControlExGasDetection() {
		return controlExGasDetection;
	}
	
	public String getControlExInstalation() {
		return controlExInstalation;
	}
	public String getExCertificate() {
		return exCertificate;
	}
	public Long getId_ex() {
		return id_ex;
	}
	public String getInstalationExGasDetection() {
		return instalationExGasDetection;
	}
	public String getMarkEx() {
		return markEx;
	}
	public String getProtectionOfElectricalOvervoltage() {
		return protectionOfElectricalOvervoltage;
	}

	public String getStudyOfDangerosZone() {
		return studyOfDangerosZone;
	}
	public void setControlExEquipment(String controlExEquipment) {
		this.controlExEquipment = controlExEquipment;
	}
	public void setControlExGasDetection(String controlExGasDetection) {
		this.controlExGasDetection = controlExGasDetection;
	}
	public void setControlExInstalation(String controlExInstalation) {
		this.controlExInstalation = controlExInstalation;
	}
	public void setExCertificate(String exCertificate) {
		this.exCertificate = exCertificate;
	}
	public void setId_ex(Long id_ex) {
		this.id_ex = id_ex;
	}
	public void setInstalationExGasDetection(String instalationExGasDetection) {
		this.instalationExGasDetection = instalationExGasDetection;
	}
	public void setMarkEx(String markEx) {
		this.markEx = markEx;
	}
	public void setProtectionOfElectricalOvervoltage(String protectionOfElectricalOvervoltage) {
		this.protectionOfElectricalOvervoltage = protectionOfElectricalOvervoltage;
	}

	public void setStudyOfDangerosZone(String studyOfDangerosZone) {
		this.studyOfDangerosZone = studyOfDangerosZone;
	}
	
	
	
}

