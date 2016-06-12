package com.nevii.servicejpa;

import java.util.Date;
import java.util.List;

import com.nevii.model.Report;

public interface ReportServiceJpa {
	
	Report findByNumbReportAndYear(Long numbReport,Integer year);
	
	List<Report> findByNumbReportAndYearReport(Long numbreport,Integer year);
	
	List<Report> findByDateReportBetween(Date startDate,Date endDate);

}
