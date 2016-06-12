package com.nevii.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Comintents {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_comintents;
	
	private Long password;
	
	@NotEmpty()
	private String name;
	@Min(value=9)
	private int pib;
	@Min(value=8)
	private int mb;
	@NotEmpty()
	private String activityOfCompany;
	
	@OneToMany(mappedBy="comintentnsReport",cascade =CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Report> reportComintents=new ArrayList<Report>();
	

	public String getActivityOfCompany() {
		return activityOfCompany;
	}
	
	
	public Long getId_comintents() {
		return id_comintents;
	}
	public int getMb() {
		return mb;
	}
	public String getName() {
		return name;
	}
	public Long getPassword() {
		return password;
	}
	
	public int getPib() {
		return pib;
	}
	public List<Report> getReportComintents() {
		return reportComintents;
	}
	
	public void setActivityOfCompany(String activityOfCompany) {
		this.activityOfCompany = activityOfCompany;
	}

	public void setId_comintents(Long id_comintents) {
		this.id_comintents = id_comintents;
	}
	
	public void setMb(int mb) {
		this.mb = mb;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(Long password) {
		this.password = password;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	public void setReportComintents(List<Report> reportComintents) {
		this.reportComintents = reportComintents;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comintents other = (Comintents) obj;
		if (activityOfCompany == null) {
			if (other.activityOfCompany != null)
				return false;
		} else if (!activityOfCompany.equals(other.activityOfCompany))
			return false;
		if (id_comintents == null) {
			if (other.id_comintents != null)
				return false;
		} else if (!id_comintents.equals(other.id_comintents))
			return false;
		if (mb != other.mb)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pib != other.pib)
			return false;
		if (reportComintents == null) {
			if (other.reportComintents != null)
				return false;
		} else if (!reportComintents.equals(other.reportComintents))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activityOfCompany == null) ? 0 : activityOfCompany.hashCode());
		result = prime * result + ((id_comintents == null) ? 0 : id_comintents.hashCode());
		result = prime * result + mb;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + pib;
		result = prime * result + ((reportComintents == null) ? 0 : reportComintents.hashCode());
		return result;
	}
	
}
