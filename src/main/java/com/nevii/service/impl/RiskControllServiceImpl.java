package com.nevii.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nevii.model.RiskControll;
import com.nevii.servic.RiskControllService;

@Service("riskControllService")
@Transactional
public class RiskControllServiceImpl implements RiskControllService {

	@Override
	public Double calcPlanOfFireProtection(RiskControll controll) {
		
		double planFire=0.0;
		
		if(controll.getPlanOfFireProtec().equals("Da")){
			
			planFire=2.0;
		}else{
			planFire=0.0;
		}
		
		return planFire;
	}

	@Override
	public Double calcRegulationOfFelding(RiskControll controll) {

		double felding=0.0;
		
		if(controll.getRegulationOfFelding().equals("Da")){
			felding=2.0;
		}else{
			felding=0.0;
		}
		
		return felding;
	}

	@Override
	public Double calcTrainingEmployers(RiskControll controll) {
		
		double trainingEmpl=0.0;
		
		if(controll.getTrainingEmployers().equals("Da")){
			trainingEmpl=2.0;
		}else{
			trainingEmpl=0.0;
		}
		
		return trainingEmpl;
	}

	@Override
	public Double calcStorageBottleUnderPress(RiskControll controll) {
		
		double bottleUnderPress=0.0;
		
		if(controll.getStorageBottleUnderPress().equals("Da")){
			bottleUnderPress=2.0;
		}else{
			bottleUnderPress=0.0;
		}
		
		return bottleUnderPress;
	}

	@Override
	public Double calcForklift(RiskControll controll) {

		double forklift=0.0;
		
		if(controll.getForklift().equals("Da")){
			forklift=2.0;
		}else{
			forklift=0.0;
		}
		
		return forklift;
	}

	@Override
	public Double calcSmokingProhibition(RiskControll controll) {

		double smoking=0.0;
		
		if(controll.getSmokingProhibition().equals("Da")){
			smoking=2.0;
		}else{
			smoking=0.0;
		}
		return smoking;
	}

	@Override
	public Double calcCleanliness(RiskControll controll) {
		
		double clean=2.0;
		
		if(controll.getCleanliness().equals("Da")){
			clean=2.0;
		}else{
			clean=0.0;
		}
		return clean;
	}

	@Override
	public Double calcSilotermometer(RiskControll controll) {
		double silotermo=0.0;
		
		if(controll.getSilotermometer().getSiloThermometer().equals("Da")&&
			controll.getSilotermometer().getReadingSiloThermometer().equals("Racunar")&&
			controll.getSilotermometer().getControlSiloThermometer().equals("Da")&&
			controll.getSilotermometer().getControlSiloThermometerSatisfies().equals("Da")){
			
			silotermo=2.0;
			
		}else if(controll.getSilotermometer().getSiloThermometer().equals("Da")&&
		controll.getSilotermometer().getReadingSiloThermometer().equals("Rucno")&&
		controll.getSilotermometer().getControlSiloThermometer().equals("Da")&&
		controll.getSilotermometer().getControlSiloThermometerSatisfies().equals("Da")){
			
			silotermo=1.0;
		}else if(controll.getSilotermometer().getSiloThermometer().equals("Ne")){
			
			silotermo=0.0;
		}
		
		return silotermo;
	}

	@Override
	public Double calcControlls(RiskControll controll) {

		double controlls;
		
		controlls=(calcControlOfBoilerUnderPress(controll)+calcControlOfElectrInst(controll)+
				calcControlOfGasInst(controll)+calcControlOfPressureVessel(controll)+
				calcControlOfPropanButanInst(controll)+calcControlOfSafteyValves(controll))/6;
		
		
		return controlls;
	}

	@Override
	public Double calcAll(RiskControll controll) {
		
		double total;
		
		total=(calcCleanliness(controll)+calcControlls(controll)+calcControlOfBoilerUnderPress(controll)+
				calcControlOfElectrInst(controll)+calcControlOfGasInst(controll)+calcControlOfPressureVessel(controll)+
				calcControlOfPropanButanInst(controll)+calcControlOfSafteyValves(controll)+calcSilotermometer(controll)+
				calcForklift(controll)+calcPlanOfFireProtection(controll)+calcRegulationOfFelding(controll)+
				calcSmokingProhibition(controll)+calcStorageBottleUnderPress(controll)+calcTrainingEmployers(controll)
				)/15;
		
		return total;
	}

	@Override
	public void mark(RiskControll controll, RiskControllServiceImpl service) {
		
		if(service.calcAll(controll)<1.0){
			controll.setMarkRiskControls("LOS");
		}else if(service.calcAll(controll)>=1.0&&service.calcAll(controll)<2.0){
			controll.setMarkRiskControls("OSREDNJI");
		}else if(service.calcAll(controll)==2){
			controll.setMarkRiskControls("DOBAR");
		}
		
	}

	@Override
	public Double calcControlOfElectrInst(RiskControll controll) {
		
		double electroInst=0.0;
		
		//elektro instalacije
				if(controll.getControls().getControlOfElectrInst().equals("Da")&&
					controll.getControls().getControlOfElectrInstSatisfies().equals("Da")){
					
					electroInst=2.0;
					
				}else if(controll.getControls().getControlOfElectrInst().equals("Da")&&
				controll.getControls().getControlOfElectrInstSatisfies().equals("Ne")){
					
					electroInst=1.0;
				}else if(controll.getControls().getControlOfElectrInst().equals("Ne")){
					
					electroInst=0.0;
				}
				
		return electroInst;
	}

	@Override
	public Double calcControlOfPropanButanInst(RiskControll controll) {
		
		double propanButanInst=0.0;
		
		//propan butan instalacije
		if(controll.getControls().getControlOfPropanButanInst().equals("Da")&&
			controll.getControls().getControlOfPropanButanInstSatisfies().equals("Da")){
			
			propanButanInst=2.0;
			
		}else if(controll.getControls().getControlOfPropanButanInst().equals("Da")&&
		controll.getControls().getControlOfPropanButanInstSatisfies().equals("Ne")){
			
		propanButanInst=1.0;
		}else if(controll.getControls().getControlOfPropanButanInst().equals("Ne")){
			propanButanInst=0.0;

		}
		return propanButanInst;
	}

	@Override
	public Double calcControlOfGasInst(RiskControll controll) {
	
	
		double gasInst=0.0;
	
		
		if(controll.getControls().getControlOfGasInst().equals("Da")&&
			controll.getControls().getControlOfGasInstSatisfies().equals("Da")){
			
			gasInst=2.0;
		}else if(controll.getControls().getControlOfGasInst().equals("Da")&&
				controll.getControls().getControlOfGasInstSatisfies().equals("Ne")){
			
				gasInst=1.0;
		}else if(controll.getControls().getControlOfGasInst().equals("Ne")){
			
			gasInst=0.0;
		}
		return gasInst;
	}

	@Override
	public Double calcControlOfPressureVessel(RiskControll controll) {
		
		double pressureVessel=0.0;
		
		if(controll.getControls().getControlOfPressureVessel().equals("Da")&&
				controll.getControls().getControlOfPressureVessel().equals("Da")){
			
			pressureVessel=2.0;
		}else if(controll.getControls().getControlOfPressureVessel().equals("Da")&&
				controll.getControls().getControlOfPressureVessel().equals("Ne")){
			
			pressureVessel=1.0;
		}else if(controll.getControls().getControlOfPressureVessel().equals("Ne")){
			
			pressureVessel=0.0;

		}
		
		return pressureVessel;
	}

	@Override
	public Double calcControlOfBoilerUnderPress(RiskControll controll) {
		
		double boilerUnderPress=0.0;
		
		if(controll.getControls().getControlOfBoilerUnderPress().equals("Da")&&
			controll.getControls().getControlOfBoilerUnderPressSatisfies().equals("Da")){
			
			boilerUnderPress=2.0;
		}else if(controll.getControls().getControlOfBoilerUnderPress().equals("Da")&&
				controll.getControls().getControlOfBoilerUnderPressSatisfies().equals("Ne")){
			
				boilerUnderPress=1.0;
			}else if(controll.getControls().getControlOfBoilerUnderPress().equals("Ne")){
				
				boilerUnderPress=0.0;
			}
		
		return boilerUnderPress;
	}

	@Override
	public Double calcControlOfSafteyValves(RiskControll controll) {
		double safteyValves=0.0;
		
		if(controll.getControls().getControlOfSafteyValves().equals("Da")&&
			controll.getControls().getControlOfSafteyValvesSatisfies().equals("Da")){
			
			safteyValves=2.0;
		}else if(controll.getControls().getControlOfSafteyValves().equals("Da")&&
				controll.getControls().getControlOfSafteyValvesSatisfies().equals("Ne")){
			
				safteyValves=2.0;
		}else if(controll.getControls().getControlOfSafteyValves().equals("Ne")){
			
			safteyValves=0.0;
		}
		
		return safteyValves;
	}

}
