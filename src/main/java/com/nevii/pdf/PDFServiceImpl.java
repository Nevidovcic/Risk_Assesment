package com.nevii.pdf;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nevii.model.Report;
import com.nevii.service.impl.ReportServiceImpl;
import com.nevii.servicejpa.impl.ReportServiceJpaImpl;

@Service("pdfService")
public class PDFServiceImpl implements PDFService {
	
	@Autowired
	ReportServiceJpaImpl reportJpaImpl;
	
	@Autowired
	ReportServiceImpl reportService;

	public Report pdfReview(String reviewRepoNum) {
		Long numbReport=reportService.parsNumbReport(reviewRepoNum);
		Integer yearReport=reportService.parsYear(reviewRepoNum);

		Report reportNumber1=reportJpaImpl.findByNumbReportAndYear(numbReport, yearReport);
		return reportNumber1;
	}

	

}
