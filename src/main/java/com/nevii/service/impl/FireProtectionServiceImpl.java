package com.nevii.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nevii.model.Protection;
import com.nevii.servic.FireProtectionService;

@Service("fireProtectionService")
@Transactional
public class FireProtectionServiceImpl implements FireProtectionService {
	
	
	/**
	 * Calculate credits based on value of field fenced in Protection class.
	 * If value is "Da" credits is 2.0 else 1.0.
	 * @param class Protection
	 * @return Double
	 * 
	 */
	public Double calcFenced(Protection pro) {
		
		double fenced=0.0;
		
		if(pro.getFenced().equals("Da")){
			
			fenced=2.0;
		}else{
			fenced=1.0;
			
		}
		
		return fenced;
	}

	/**
	 * Calculate credits based on value of field illuminated in Protection class.
	 * If value is "Da" credit is 2.0 else credit is 0.0.
	 * @param class Protection
	 * @return  Double
	 * 
	 */
	public Double calcIlluminated(Protection pro) {
		
		double illuminated=0.0;
		
		if(pro.getIlluminated().equals("Da")){
			
			illuminated=2.0;
		}else{
			
			illuminated=0.0;
		}
		return illuminated;
	}
	
	/**
	 * Calculate credits based on value of field fireBrigade in Protection class.
	 * If value is "Da" credit is 2.0 else credit is 1.0.
	 * @param class Protection
	 * @return  Double
	 * 
	 */
	public Double calcFireBrigade(Protection pro) {
		
		double fireBrigade=0.0;
		
		if(pro.getFireBrigade().equals("Da")){
			
			fireBrigade=2.0;
		}else{
			
			fireBrigade=1.0;
		}
		
		return fireBrigade;
	}

	/**
	 * Calculate credits based on value of security in Protection class.
	 * If value is "Da" credit is 2.0 else credit is 0.0.
	 * @param class Protection
	 * @return  Double
	 * 
	 */
	public Double calcSecurity(Protection pro) {
		
		double security=0.0;
		
		if(pro.getSecurity().equals("Da")){
			
			security=2.0;
		}else{
			
			security=0.0;
		}
		
		return security;
	}

	/**
	 * Calculate credits based on value of field fireProtectionMan in Protection class.
	 * If value is "Da" credit is 2.0 else credit is 0.0.
	 * @param class Protection
	 * @return  Double
	 * 
	 */
	public Double calcFireProtectionMan(Protection pro) {
		
		double fireMan=0.0;
		
		if(pro.getFireProtectionMan().equals("Da")){
			
			fireMan=2.0;
		}else{
			
			fireMan=0.0;
		}
		return fireMan;
	}
	
	
	/**
	 * Calculate credits based on value of fields in Hydrant class.
	 * @param class Protection
	 * @return  Double
	 * 
	 */
	public Double calcHydrant(Protection pro) {
		
		double hydrant=0.0;
		
		if(pro.getHydrant().getHydrants().equals("Ne")) {
					
					hydrant=0.0;
					
		} else if(pro.getHydrant().getHydrants().equals("Da")&&
				pro.getHydrant().getHydrantsPressure().equals("Da")&&
				  pro.getHydrant().getHydrantsCabAffordable().equals("Ne")&&
				  pro.getHydrant().getHydrantsCabEqquiped().equals("Ne")){
			
			hydrant=1.0;
			
		}else if(pro.getHydrant().getHydrants().equals("Da")&&
				pro.getHydrant().getHydrantsPressure().equals("Da")&&
					pro.getHydrant().getHydrantsCabAffordable().equals("Da")&&
					pro.getHydrant().getHydrantsCabEqquiped().equals("Da")){
					
					hydrant=2.0;
			
				}
				
				return hydrant;

		}
		
	/**
	 * Calculate credits based on value of fields in FireExtinguisher class.
	 * @param class Protection
	 * @return  Double
	 * 
	 */
		public Double calcFireExtinguisher(Protection pro){
			
			double exting=0.0;
			
			if(pro.getFireExtinguisher().getFireExting().equals("Ne")){
				
				exting=0.0;
				
			}else if(pro.getFireExtinguisher().getFireExting().equals("Da")&&
					pro.getFireExtinguisher().getFireExtingNumb().equals("Ne")&&
					pro.getFireExtinguisher().getFireExtingProbe().equals("Da")){
						
						exting=1.0;
				
				
			}else if(pro.getFireExtinguisher().getFireExting().equals("Da")&&
				pro.getFireExtinguisher().getFireExtingNumb().equals("Da")&&
				pro.getFireExtinguisher().getFireExtingProbe().equals("Da")){
				
				exting=2.0;
				
					}

			return exting;
		}


		/**
		 * Calculate credits based on value of fields in LightConductor class.
		 * @param class Protection
		 * @return  Double
		 * 
		 */
		public Double calcLightConduc(Protection pro) {
			
			double lightConduct=0.0;
			
			if(pro.getLightningConductor().getLightningRod().equals("Ne")){
				
				lightConduct=0.0;
				
			}else if(pro.getLightningConductor().getLightningRod().equals("Da")&&
					pro.getLightningConductor().getLightningRodFunct().equals("Ne")&&
					pro.getLightningConductor().getLightningRodProbe().equals("Da")){
				
				lightConduct=1.0;
				
			}else if(pro.getLightningConductor().getLightningRod().equals("Da")&&
				pro.getLightningConductor().getLightningRodFunct().equals("Da")&&
				pro.getLightningConductor().getLightningRodProbe().equals("Da")){
				
				lightConduct=2.0;
				
			}			
				
			return lightConduct;
		}


		/**
		 * Calculate credits based on value of fields in FireAlarm class.
		 * @param class Protection
		 * @return  Double
		 * 
		 */
		public Double calcFireAlarm(Protection pro) {
			
			double fireAlarm=0.0;
			
			if(pro.getFireAlarm().getFireReport().equals("Ne")){
				
				fireAlarm=0.0;
			}else if(pro.getFireAlarm().getFireReportProbe().equals("Ne")){
				
				fireAlarm=1.0;
		
			}else if(pro.getFireAlarm().getFireReport().equals("Da")&&
				pro.getFireAlarm().getFireReportMonitord().equals("Da")&&
				pro.getFireAlarm().getFireReportProbe().equals("Da")){
				
				fireAlarm=2.0;
		
			}
				
				
			return fireAlarm;
		}


		/**
		 * Calculate credits based on value of fields in FireFightingIns class.
		 * @param class Protection
		 * @return  Double
		 * 
		 */
		public Double calcFireFigtInst(Protection pro) {

			double fireFightinst=0.0;
			
			if(pro.getFireFightingIns().getFireFigtingInstal().equals("Ne")){
				
				fireFightinst=0.0;
				
			}else if(pro.getFireFightingIns().getFireFigtingInstProbe().equals("Ne")){
				
				fireFightinst=1.0;
				
			}else if(pro.getFireFightingIns().getFireFigtingInstal().equals("Da")&&
					pro.getFireFightingIns().getFireFigtingInstFunct().equals("Da")&&
				pro.getFireFightingIns().getFireFigtingInstProbe().equals("Da")){
				
				fireFightinst=2.0;
			}
			
			return fireFightinst;
		}


		/**
		 * Calculate credits based on value of field theftSystem in Prtection class.
		 * @param class Protection
		 * @return  Double
		 * 
		 */
		public Double calcTheftSystem(Protection pro) {
			
			double theft=0.0;
			
			if(pro.getTheftSystem().equals("Da")){
				
				theft=2.0;
			}else{
				
				theft=1.0;
			}
			
			return theft;
		}

		/**
		 * Calculate credits based on value of field videoSurvey in Protection class.
		 * If value is "Da" credit is 2.0 else credit is 0.0.
		 * @param class Protection
		 * @return  Double
		 * 
		 */
		public Double calcVideoSurve(Protection pro) {

			double video=0.0;
			
			if(pro.getVideoSurve().equals("Da")){
				
				video=2.0;
			}else{
				
				video=0.0;
			}
			return video;
		}

		
		/**
		 * Calculate total credits using methods that calculate credits for value of fields in Protection class.
		 * If value is "Da" credit is 2.0 else credit is 0.0.
		 * @param class Protection
		 * @return  Double
		 * 
		 */
		public Double calcFinalResult(Protection pro) {
			
			double total=0.0;


			total=(calcHydrant(pro)+calcFenced(pro)+calcFireAlarm(pro)+
					calcFireBrigade(pro)+calcFireExtinguisher(pro)+calcFireFigtInst(pro)+
					calcFireProtectionMan(pro)+calcIlluminated(pro)+calcLightConduc(pro)+
					calcSecurity(pro)+calcTheftSystem(pro)+calcVideoSurve(pro))/12;
		
			
			return total;

		}
		
		
		
		/**
		 * Calculate mark of Protection entity using method calcFinalPro().
		 * If value is "Da" credit is 2.0 else credit is 0.0.
		 * @param class Protection
		 * @param class FireProtectionServiceImpl
		 */
		public void mark(Protection pro,FireProtectionServiceImpl service) {

			if(service.calcFinalResult(pro)<1.0){
				pro.setMark("LOS");
			}else if(service.calcFinalResult(pro)>=1.0&&service.calcFinalResult(pro)<2.0){
				pro.setMark("OSREDNJI");
			}else if(service.calcFinalResult(pro)==2){
				pro.setMark("DOBAR");
			}
		}



}
