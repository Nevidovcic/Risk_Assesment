package com.nevii.servic;

import com.nevii.model.Ex;
import com.nevii.service.impl.ExServiceImpl;

public interface ExService {
	
	Double calcStudyOfDangerosZone(Ex ex);
	
	Double calcExCertificate(Ex ex);
	
	Double calcControlExEquipment(Ex ex);
	
	Double calcControlExInstalation(Ex ex);
	
	Double calcInstalationExGasDetection(Ex ex);
	
	Double calcControlExGasDetection(Ex ex);
	
	Double calcProtectionOfElectricalOvervoltage(Ex ex);
	
	Double calcAllEx(Ex ex);
	
	void markEx(Ex ex,ExServiceImpl service);

}
