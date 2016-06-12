package com.nevii.servic;

import org.springframework.stereotype.Component;

import com.nevii.model.Comintents;

@Component
public interface ComintentsService {
	
	void passwordComintents(Comintents comint,long number);
	
	

}
