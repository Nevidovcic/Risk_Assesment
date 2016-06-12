package com.nevii.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nevii.model.Report;
import com.nevii.servic.ReportService;

@Service("reportService")
@Transactional
public class ReportServiceImpl implements ReportService {

	public void reportNumber(Report report,long number ) {
		
		long reportNum=number++;
		
		report.setNumbReport(reportNum);
		
	}

	
	public void reportYear(Report report) {
		
		int year;
		
		year=Calendar.getInstance().get(Calendar.YEAR);
		
		report.setYear(year);
		
	}


	public void reportDateAndTime(Report report){
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		Date date = new Date();
	
		report.setDateReport(dateFormat.format(date));
	}


	
	public void reportAll(Report report,long number) {
		
		
			reportDateAndTime(report);
		
		reportNumber(report,number);
		reportYear(report);
		
	}


	public void markReport(Report report, FireProtectionServiceImpl fireService,
			FacilitiesOnSiteServiceImpl facilitiesService, ExServiceImpl exService,
			RiskControllServiceImpl riskService) {
		
		double markAll=(fireService.calcFinalResult(report.getProtectionReport())+
				       facilitiesService.calcAll(report.getFacilitiesReport())+
				       exService.calcAllEx(report.getExReport())+riskService.calcAll(report.getRiskReport()))/4; 
		
		if(markAll<1.0){
			report.setMarkReport("LOS");
		}else if(markAll>=1.0&&markAll<2.0){
			report.setMarkReport("OSREDNJI");
		}else if(markAll==2.0){
			report.setMarkReport("DOBAR");
		}
		
		
	}


	@Override
	public Long parsNumbReport(String reportNumber) {
		
		//RA-1/2016
		String[] numbRepo=reportNumber.split("[\\W]");
		
		Long number=Long.parseLong(numbRepo[1]);
		
		return number;
	}


	@Override
	public Integer parsYear(String reportNumber) {
		
		String[] yearRepo=reportNumber.split("[\\W]");
		
		Integer year=Integer.parseInt(yearRepo[2]);
		return year;
	}



	
}
