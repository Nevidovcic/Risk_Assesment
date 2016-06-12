package com.nevii.servic;

import com.nevii.model.RiskControll;
import com.nevii.service.impl.RiskControllServiceImpl;

public interface RiskControllService {
		
	Double calcPlanOfFireProtection(RiskControll controll);
	
	Double calcRegulationOfFelding(RiskControll controll);
	
	Double calcTrainingEmployers(RiskControll controll);
	
	Double calcStorageBottleUnderPress(RiskControll controll);
	
	Double calcForklift(RiskControll controll);
	
	Double calcSmokingProhibition(RiskControll controll);
	
	Double calcCleanliness(RiskControll controll);
	
	Double calcSilotermometer(RiskControll controll);
	
	Double calcControlOfElectrInst(RiskControll controll);
	
	Double calcControlOfPropanButanInst(RiskControll controll);
	
	Double calcControlOfGasInst(RiskControll controll);
	
	Double calcControlOfPressureVessel(RiskControll controll);
	
	Double calcControlOfBoilerUnderPress(RiskControll controll);
	
	Double calcControlOfSafteyValves(RiskControll controll);
	
	Double calcControlls(RiskControll controll);
	
	Double calcAll(RiskControll controll);
	
	void mark(RiskControll pro,RiskControllServiceImpl service);

}
