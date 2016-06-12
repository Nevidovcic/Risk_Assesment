package com.nevii.servic;

import com.nevii.model.FacilitiesOnSite;
import com.nevii.service.impl.FacilitiesOnSiteServiceImpl;


public interface FacilitiesOnSiteService {
	
	Double calcAccesLocation(FacilitiesOnSite facilities);
	
	Double calcNeighbors(FacilitiesOnSite facilities);
	
	Double calcConstruction(FacilitiesOnSite facilities);
	
	Double calcExteriorWalls(FacilitiesOnSite facilities);
	
	Double calcRoofConstruction(FacilitiesOnSite facilities);
		
	Double calcRoofCover(FacilitiesOnSite facilities);
	
	Double calcAll(FacilitiesOnSite facilities);
	
	void mark(FacilitiesOnSite facilities,FacilitiesOnSiteServiceImpl service);
		
		
	
}
