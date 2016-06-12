package com.nevii.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nevii.model.Comintents;
import com.nevii.service.impl.ComintentsServiceImpl;
import com.nevii.servicejpa.impl.ComintentsServiceJpaImpl;

@Controller
@RequestMapping(value="/comintents")
@SessionAttributes("comintent")
public class ComintentsController {
	
	@Autowired(required=true)
	private ComintentsServiceJpaImpl comintServiceJpaImpl;
	
	@Autowired(required=true)
	private ComintentsServiceImpl comintServiceImpl;

	long number=1;
	
	@RequestMapping(method=RequestMethod.GET)
	public String start(Model model){
		Comintents comint=new Comintents();
	
		model.addAttribute("comintent", comint);
		
		return "comintents";
	
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String save(@Valid @ModelAttribute("comintent")Comintents comintent,BindingResult result){
		
		Comintents comintents;

	if(result.hasErrors()){
			
			return "comintents";
			
	}else{
    	
		if(comintent.getId_comintents()==null){
			
			comintents=comintServiceJpaImpl.save(comintent);
			comintServiceImpl.passwordComintents(comintent,number);
			comintServiceJpaImpl.update(comintents);
			number++;
		}
    		   	
					
    		}
 
	return "comintents";
	
	}
	
	@RequestMapping(value="/reviewAllComintents",method=RequestMethod.GET)
	public String getAllComintents(Model model){
		
		List<Comintents> comintentsAll=comintServiceJpaImpl.findAll();
		
		model.addAttribute("comintentsAll",comintentsAll);
		
		return "reviewAllComintents";
		
		
	}
	
	@RequestMapping(value="/findComintents",method=RequestMethod.GET)
	public String findComintentsByParameter(Model model,@RequestParam Map<String,String> request){
		
		String reviewPass=request.get("reviewPass");
		String rewienameCompany=request.get("rewienameCompany");
		String reviewPib=request.get("reviewPib");
		String reviewMb=request.get("reviewMb");
		
	if(!rewienameCompany.isEmpty()){
				Comintents findByName=comintServiceJpaImpl.findByName(rewienameCompany);
				model.addAttribute("findByNameComin",findByName);
			}
	if(!reviewPass.isEmpty()){
				Comintents findByPass=comintServiceJpaImpl.findByPass(Long.valueOf(reviewPass).longValue());
				model.addAttribute("findByNameComin",findByPass);
			}
	if(!reviewMb.isEmpty()){
				Comintents findByMb=comintServiceJpaImpl.findByMb(Integer.parseInt(reviewMb));
				model.addAttribute("findByNameComin",findByMb);
			}
	if(!reviewPib.isEmpty()){
				Comintents findByPib=comintServiceJpaImpl.findByPib(Integer.parseInt(reviewPib));
				model.addAttribute("findByNameComin",findByPib);
			}
		return "review";
		
		
	}

}
