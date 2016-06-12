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
public class FacilitiesOnSite {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_facilities;
	

	@NotEmpty
	private String accessLocation;//pristup lokaciji

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_neighbors")
	@Valid
	private Neighbors neighbor;//susedi
	
	@NotEmpty
	private String objectConstruction;
	@NotEmpty
	private String exteriorWalls;//spoljni zidovi
	@NotEmpty
	private String roofConstruction;//konstrukcija krova
	@NotEmpty
	private String roofCover;//krovni pokrivac
	
	private String markFacilities;

	public String getAccessLocation() {
		return accessLocation;
	}

	public String getExteriorWalls() {
		return exteriorWalls;
	}

	public Long getId_facilities() {
		return id_facilities;
	}

	public String getMarkFacilities() {
		return markFacilities;
	}

	public Neighbors getNeighbor() {
		return neighbor;
	}

	public String getObjectConstruction() {
		return objectConstruction;
	}



	public String getRoofConstruction() {
		return roofConstruction;
	}

	public String getRoofCover() {
		return roofCover;
	}

	public void setAccessLocation(String accessLocation) {
		this.accessLocation = accessLocation;
	}

	public void setExteriorWalls(String exteriorWalls) {
		this.exteriorWalls = exteriorWalls;
	}

	public void setId_facilities(Long id_facilities) {
		this.id_facilities = id_facilities;
	}

	public void setMarkFacilities(String markFacilities) {
		this.markFacilities = markFacilities;
	}

	public void setNeighbor(Neighbors neighbor) {
		this.neighbor = neighbor;
	}

	public void setObjectConstruction(String objectConstruction) {
		this.objectConstruction = objectConstruction;
	}


	public void setRoofConstruction(String roofConstruction) {
		this.roofConstruction = roofConstruction;
	}

	public void setRoofCover(String roofCover) {
		this.roofCover = roofCover;
	}
	

	
		
	
}
