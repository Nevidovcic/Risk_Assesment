package com.nevii.controller;



import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.nevii.model.Comintents;
import com.nevii.model.Report;
import com.nevii.pdf.PDFServiceImpl;
import com.nevii.service.impl.ExServiceImpl;
import com.nevii.service.impl.FacilitiesOnSiteServiceImpl;
import com.nevii.service.impl.FireProtectionServiceImpl;
import com.nevii.service.impl.ReportServiceImpl;
import com.nevii.service.impl.RiskControllServiceImpl;
import com.nevii.servicejpa.impl.ComintentsServiceJpaImpl;
import com.nevii.servicejpa.impl.ReportServiceJpaImpl;

@Controller
@SessionAttributes("report")
@RequestMapping(value="/reports")
public class ReportController {
	
	@Autowired(required=true)
	private ReportServiceJpaImpl reportServiceJpa;
	
	@Autowired(required=true)
	private ReportServiceImpl reportService;
	
	@Autowired(required=true)
	private RiskControllServiceImpl riskService;
	
	@Autowired(required=true)
	private FireProtectionServiceImpl protectionService;
	
	@Autowired(required=true)
	private ExServiceImpl exService;
	
	@Autowired(required=true)
	private FacilitiesOnSiteServiceImpl facilitiesService;
	
	@Autowired(required=true)
	private ComintentsServiceJpaImpl comintentServiceJpa;
	
	@Autowired(required=true)
	PDFServiceImpl pdfServiceImpl;

	long repoNumber=1;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initMethod(Model model){
		Report report=new Report();
		model.addAttribute("report", report);
		return "report";
	}
	

	@RequestMapping(method=RequestMethod.POST)
	public String save(@RequestParam ("passReport")String passReport, @Valid @ModelAttribute("report")Report report1,BindingResult result, SessionStatus status){
		
		Report report=null;
		
		if(result.hasErrors()){
			
    		return "report";
    	}else{
    		Comintents comintents=comintentServiceJpa.findByPass(Long.valueOf(passReport));
    		
    		report1.setComintentnsReport(comintents);
    		
    	report=reportServiceJpa.save(report1);
    	
    	//dajem formu datumu i godini
    	reportService.reportAll(report1,repoNumber );
    	reportService.markReport(report1, protectionService, facilitiesService, exService, riskService);
    	
    	reportServiceJpa.update(report);
    	
    	repoNumber++;
    		  	}

	return "report";
	}
	
	@RequestMapping(method=RequestMethod.GET,params={"showReport"})
	public String findByYearAndNumber(@RequestParam ("reportNumS")String repoNum, @Valid @ModelAttribute("report")Report report1,Model model,BindingResult result){
		
		if(result.hasErrors()){
    		return "report";
    	}else{
    		
    		Long numbReport=reportService.parsNumbReport(repoNum);
    		Integer yearReport=reportService.parsYear(repoNum);

    		Report reportNumber2=reportServiceJpa.findByNumbReportAndYear(numbReport, yearReport);
    		
    	model.addAttribute("showReport",reportNumber2);
    	
    		  	}

	return"report";
	}
	
	@RequestMapping(method=RequestMethod.GET,params={"print"})
	public ModelAndView pringReport(@RequestParam ("reportNumS")String repoNum, @Valid @ModelAttribute("report")Report report1,BindingResult result){
		
			

    		Report reportNumb = pdfServiceImpl.pdfReview(repoNum);
    		
    		
    		return new ModelAndView("pdfReport","report",reportNumb);

	}
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String findByOne(@PathVariable Long id, @Valid @ModelAttribute("report")Report report1,BindingResult result){
		
		Report report;
		
		if(result.hasErrors()){
    		return "report";
    	}else{
    		
    	report=reportServiceJpa.findById(id);
    	
    		  	}

	return"report";
	}

	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteById(@PathVariable Long id, @Valid @ModelAttribute("report")Report report1,BindingResult result){
		
		Report report=reportServiceJpa.findById(id);
		
		if(result.hasErrors()){
    		return "report";
    	}else{
    		if(report!=null){
    			reportServiceJpa.delete(report); 
    		}
    		
    	
    		  	}

	return"redirect:/reports";
	}
	

	@RequestMapping(method=RequestMethod.PUT)
	public String updateReport(@RequestParam (value="passReport",required=true)String passReport, @Valid @ModelAttribute("report")Report report1,BindingResult result){
		
		Report report;
		
		if(result.hasErrors()){
    		return "report";
    	}else{
    	
    		
    		Comintents comintents=comintentServiceJpa.findByPass(Long.valueOf(passReport));
    		
    		report1.setComintentnsReport(comintents);
    		
    	report=reportServiceJpa.save(report1);
    	
    	reportService.reportAll(report1,repoNumber );
    	reportService.markReport(report1, protectionService, facilitiesService, exService, riskService);
    	
    	reportServiceJpa.update(report);

    		  	}

	return"report";
		
		
	}

	@RequestMapping(value="/reviewReportPass",method=RequestMethod.GET)
	public String getAllReport(Model model){
		
		List<Comintents> comAll=comintentServiceJpa.findAll();
		
		model.addAttribute("comAll",comAll);
		
		return "reviewReportPass";
		
	}

	@RequestMapping(method=RequestMethod.GET,params={"reportPass"})
	public String findByPass(@RequestParam (value="passReport",required=true)String passReport,Model model){

		Comintents comintents=comintentServiceJpa.findByPass(Long.valueOf(passReport));
		model.addAttribute("comintents",comintents);
		
		return "report";
	}
	
	

}
