package com.nevii.servic;

import java.text.ParseException;

import com.nevii.model.Report;
import com.nevii.service.impl.ExServiceImpl;
import com.nevii.service.impl.FacilitiesOnSiteServiceImpl;
import com.nevii.service.impl.FireProtectionServiceImpl;
import com.nevii.service.impl.RiskControllServiceImpl;

public interface ReportService {
	
	
	 void reportNumber(Report report,long number);
	 
	 void reportYear(Report report);
	 
	 void reportDateAndTime(Report report) ;
	 
	 void reportAll(Report report,long number);
	
	 void markReport(Report report,FireProtectionServiceImpl fireService,FacilitiesOnSiteServiceImpl facilitiesService,
			 		 ExServiceImpl exService,RiskControllServiceImpl riskService );
	 
	 Long parsNumbReport(String reportNumber);
	 
	 Integer parsYear(String reportNumber);
	 

}
