package com.nevii.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Report {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_report;

	private Long numbReport;
	
	private Integer year;
	
	private String dateReport;
	
	private String markReport;

	
	@ManyToOne(fetch=FetchType.LAZY)
	private Comintents comintentnsReport;

	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="id_protection")
	@Valid
	private Protection protectionReport;

	@OneToOne(cascade =CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="id_ex")
	@Valid
	private Ex exReport;

	@OneToOne(cascade =CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="id_riskControll")
	@Valid
	private RiskControll riskReport;

	@OneToOne(cascade =CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="id_facilities")
	@Valid
	private FacilitiesOnSite facilitiesReport;



	public Ex getExReport() {
		return exReport;
	}

	public FacilitiesOnSite getFacilitiesReport() {
		return facilitiesReport;
	}

	public Long getId_report() {
		return id_report;
	}

	public String getMarkReport() {
		return markReport;
	}

	public Long getNumbReport() {
		return numbReport;
	}

	public Protection getProtectionReport() {
		return protectionReport;
	}

	public RiskControll getRiskReport() {
		return riskReport;
	}

	public Integer getYear() {
		return year;
	}


	public Comintents getComintentnsReport() {
		return comintentnsReport;
	}


	public void setComintentnsReport(Comintents comintentnsReport) {
		this.comintentnsReport = comintentnsReport;
	}

	
		public String getDateReport() {
		return dateReport;
	}

	public void setDateReport(String dateReport) {
		this.dateReport = dateReport;
	}

		public void setExReport(Ex exReport) {
		this.exReport = exReport;
	}

	public void setFacilitiesReport(FacilitiesOnSite facilitiesReport) {
		this.facilitiesReport = facilitiesReport;
	}

	public void setId_report(Long id_report) {
		this.id_report = id_report;
	}

	public void setMarkReport(String markReport) {
		this.markReport = markReport;
	}

	public void setNumbReport(Long numbReport) {
		this.numbReport = numbReport;
	}

	public void setProtectionReport(Protection protectionReport) {
		this.protectionReport = protectionReport;
	}

	public void setRiskReport(RiskControll riskReport) {
		this.riskReport = riskReport;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "RA-"+this.getNumbReport()+"/"+this.getYear();
	}




	
}
