package com.nevii.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nevii.model.Ex;
import com.nevii.servic.ExService;

@Service("exService")
@Transactional
public class ExServiceImpl implements ExService{

	@Override
	public Double calcStudyOfDangerosZone(Ex ex) {
		
		double dangerosZone=0.0;
		
		if(ex.getStudyOfDangerosZone().equals("Da")){
			
			dangerosZone=2.0;
		}else{
			dangerosZone=0.0;
		}
		
		return dangerosZone;
	}

	@Override
	public Double calcExCertificate(Ex ex) {
		
		double exCertificate=0.0;
		
		if(ex.getExCertificate().equals("Da")){
			
			exCertificate=2.0;
		}else{
			exCertificate=1.0;
			
		}
		
		
		return exCertificate;
	}

	@Override
	public Double calcControlExEquipment(Ex ex) {
		
		double exEquipment=0.0;
		
		if(ex.getControlExEquipment().equals("Da")){
			exEquipment=2.0;
		}else{
			exEquipment=0.0;
		}
		
		return exEquipment;
	}

	@Override
	public Double calcControlExInstalation(Ex ex) {
		
		double exInstalation=0.0;
		
		if(ex.getControlExInstalation().equals("Da")){
			exInstalation=2.0;
			
		}else{
			exInstalation=0.0;
		}
		
		return exInstalation;
	}

	@Override
	public Double calcInstalationExGasDetection(Ex ex) {
		
		double exGasDetection=0.0;
		
		if(ex.getInstalationExGasDetection().equals("Da")){
			
			exGasDetection=2.0;
		}else{
			exGasDetection=0.0;
		}
		return exGasDetection;
	}

	@Override
	public Double calcControlExGasDetection(Ex ex) {

		double controll=0.0;
		
		if(ex.getControlExGasDetection().equals("Da")){
			controll=2.0;
		}else{
			controll=0.0;
		}
		
		return controll;
	}

	@Override
	public Double calcProtectionOfElectricalOvervoltage(Ex ex) {
		
		
		double electricalOvervoltage=0.0;
		
		if(ex.getProtectionOfElectricalOvervoltage().equals("Da")){
			
			electricalOvervoltage=2.0;
		}else{
			
			electricalOvervoltage=0.0;
		}
		return electricalOvervoltage;
	}

	@Override
	public Double calcAllEx(Ex ex) {
		
		double allEx;
		
		allEx=(calcControlExEquipment(ex)+calcControlExGasDetection(ex)+calcControlExInstalation(ex)+
				calcExCertificate(ex)+calcInstalationExGasDetection(ex)+calcProtectionOfElectricalOvervoltage(ex)+
				calcStudyOfDangerosZone(ex))/7;
		
		return allEx;
	}

	@Override
	public void markEx(Ex ex, ExServiceImpl service) {
		
		if(service.calcAllEx(ex)<1.0){
			ex.setMarkEx("LOS");
		}else if(service.calcAllEx(ex)>=1.0&&service.calcAllEx(ex)<2.0){
			ex.setMarkEx("OSREDNJI");
		}else if(service.calcAllEx(ex)==2){
			ex.setMarkEx("DOBAR");
		}
		
	}

}
