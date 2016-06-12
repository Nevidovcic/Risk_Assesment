package com.nevii.servic;

import com.nevii.model.Protection;
import com.nevii.service.impl.FireProtectionServiceImpl;


public interface FireProtectionService {
	
	Double calcHydrant(Protection pro);
	
	Double calcFireExtinguisher(Protection pro);
	
	Double calcLightConduc(Protection pro);
	
	Double calcFireAlarm(Protection pro);
	
	Double calcFireFigtInst(Protection pro);
	
	Double calcFenced(Protection pro);
	
	Double calcIlluminated(Protection pro);
	
	Double calcFireBrigade(Protection pro);
	
	Double calcSecurity(Protection pro);
	
	Double calcFireProtectionMan(Protection pro);
	
	Double calcTheftSystem(Protection pro);
	
	Double calcVideoSurve(Protection pro);
	
	Double calcFinalResult(Protection pro);

	void mark(Protection pro,FireProtectionServiceImpl service);
}
