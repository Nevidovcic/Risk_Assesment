package com.nevii.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nevii.model.FacilitiesOnSite;
import com.nevii.servic.FacilitiesOnSiteService;

@Service("facilitiesOnSiteService")
@Transactional
public class FacilitiesOnSiteServiceImpl implements FacilitiesOnSiteService {

	/**
	 * Calculate credits based on value of field accessLocation in FacilitiesOnSite class.
	 * @param class FacilitiesOnSite
	 * @return double value
	 */
	public Double calcAccesLocation(FacilitiesOnSite facilities) {
		
		double access=0.0;
		
			if(facilities.getAccessLocation().equals("sa sve 4 strane")){
				access=2.0;
			}else if(facilities.getAccessLocation().equals("sa 3 strane")){
				access=1.0;
			}else if(facilities.getAccessLocation().equals("sa 2 strane")){
				access=0.0;
			}
		
		return access;
	}

	/**
	 * Calculate credits based on value of field neighbour in FacilitiesOnSite class.
	 * @return value of neighbour method variable
	 * @param facilities class FacilitiesOnSite
	 * @see Double
	 */
	public Double calcNeighbors(FacilitiesOnSite facilities) {
		
		double neighbour=0.0;
		
		if(facilities.getNeighbor().getNeighborsPresence().equals("Ne")){
			
			neighbour=2.0;
			
		}else if(facilities.getNeighbor().getNeighborsPresence().equals("Da")&&
				facilities.getNeighbor().getNeighborsActivity().equals("Ne")){
			
			neighbour=1.0;
			
		}else if(facilities.getNeighbor().getNeighborsPresence().equals("Da")&&
				facilities.getNeighbor().getNeighborsActivity().equals("Da")){
			
			neighbour=0.0;
		}
		
		return neighbour;
	}

	/**
	 * Calculate credits based on value of field objectConstruction in FacilitiesOnSite class.
	 * @return value of construc method variable
	 * @param facilities class FacilitiesOnSite
	 * @see Double
	 */
	public Double calcConstruction(FacilitiesOnSite facilities) {
		
		double construc=0.0;
		
		if(facilities.getObjectConstruction().equals("Betonska")){
			construc=2.0;
		}else if(facilities.getObjectConstruction().equals("Celicna")){
			construc=1.0;
		}else if(facilities.getObjectConstruction().equals("Drvena")){
			construc=0.0;
		}
		
		
		return construc;
	}

	/**
	 * 
	 */
	public Double calcExteriorWalls(FacilitiesOnSite facilities) {
		
		double exterior=0.0;
		
		if(facilities.getExteriorWalls().equals("Cigla")||
		   facilities.getExteriorWalls().equals("Beton")||
		   facilities.getExteriorWalls().equals("Paneli od straklene vune")){
			
			exterior=2.0;
			
		}else if(facilities.getExteriorWalls().equals("Paneli od poliuretana")){
			
			exterior=1.0;
		}else if(facilities.getExteriorWalls().equals("Drvene ploce")){
			exterior=0.0;
		}
		
		return exterior;
	}

	/**
	 * 
	 */
	public Double calcRoofConstruction(FacilitiesOnSite facilities) {
		
		double roofContstr=0.0;
		
		if(facilities.getRoofConstruction().equals("Betonska")){
			roofContstr=2.0;
		}else if(facilities.getRoofConstruction().equals("Celicna")){
			roofContstr=1.0;
		}else if(facilities.getRoofConstruction().equals("Drvena")){
			roofContstr=0.0;
		}
		
		
		return roofContstr;
	}

	/**
	 * 
	 */
	public Double calcRoofCover(FacilitiesOnSite facilities) {
		
		double roofCover=0.0;
		
		if(facilities.getRoofCover().equals("Crep")||
				facilities.getRoofCover().equals("Paneli od straklene vune")){
			roofCover=2.0;
		}else if(facilities.getRoofCover().equals("Sendvic lim")){
			roofCover=1.0;
		}else if(facilities.getRoofCover().equals("Paneli od poliuretana")){
			roofCover=0.0;
		}
		
		return roofCover;
	}

	/**
	 * 
	 */
	public Double calcAll(FacilitiesOnSite facilities) {
	
		double total=0.0;
		
		total=(calcAccesLocation(facilities)+calcConstruction(facilities)+calcExteriorWalls(facilities)+
			   calcNeighbors(facilities)+calcRoofConstruction(facilities)+calcRoofCover(facilities))/6;
		
		return total;
	}

	/**
	 * 
	 */
	public void mark(FacilitiesOnSite facilities, FacilitiesOnSiteServiceImpl service) {
		
		if(service.calcAll(facilities)<1.0){
			facilities.setMarkFacilities("LOS");
		}else if(service.calcAll(facilities)>=1.0&&service.calcAll(facilities)<2.0){
			facilities.setMarkFacilities("OSREDNJI");
		}else if(service.calcAll(facilities)==2){
			facilities.setMarkFacilities("DOBAR");
		}
		
	}

}
