package com.nevii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class FireAlarm {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_fireAlarm;
	
	@NotEmpty
	private String fireReport;
	@NotEmpty
	private String fireReportProbe;
	@NotEmpty
	private String fireReportMonitord;

	public String getFireReport() {
		return fireReport;
	}
	public String getFireReportMonitord() {
		return fireReportMonitord;
	}
	public String getFireReportProbe() {
		return fireReportProbe;
	}
	public Long getId_fireAlarm() {
		return id_fireAlarm;
	}

	public void setFireReport(String fireReport) {
		this.fireReport = fireReport;
	}
	public void setFireReportMonitord(String fireReportMonitord) {
		this.fireReportMonitord = fireReportMonitord;
	}
	public void setFireReportProbe(String fireReportProbe) {
		this.fireReportProbe = fireReportProbe;
	}
	public void setId_fireAlarm(Long id_fireAlarm) {
		this.id_fireAlarm = id_fireAlarm;
	}

}
