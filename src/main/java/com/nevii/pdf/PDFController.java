package com.nevii.pdf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nevii.model.Report;
import com.nevii.service.impl.ReportServiceImpl;
import com.nevii.servicejpa.impl.ReportServiceJpaImpl;

@Controller
public class PDFController{

	
	@Autowired
	ReportServiceJpaImpl reportJpaImpl;
	
	@Autowired
	ReportServiceImpl reportService;
	
	@Autowired
	PDFServiceImpl pdfServiceImpl;
	
	
	@RequestMapping(value="/pdfReport/{id}",method=RequestMethod.GET)
	public ModelAndView pdfReportId(@PathVariable Long id){
		
		//model
		Report report=reportJpaImpl.findById(id);
		
		
		return new ModelAndView("pdfReport","report",report);
	}
	
	
	@RequestMapping(value="/pdfReport",method=RequestMethod.GET)
	public ModelAndView pdfReport(@RequestParam ("reportNumS")String repoNum ){
		
		Report reportNumb = pdfServiceImpl.pdfReview(repoNum);
		
		
		return new ModelAndView("pdfReport","report",reportNumb);
	}

	@RequestMapping(value="/pdfReviewReport",method=RequestMethod.GET)
	public ModelAndView pdfReviewReport(@RequestParam ("reviewRepoNum")String reviewRepoNum  ){
	
	
		Report reportNumber1 = pdfServiceImpl.pdfReview(reviewRepoNum);
		
		return new ModelAndView("pdfReport","report",reportNumber1);
	}

	
}
