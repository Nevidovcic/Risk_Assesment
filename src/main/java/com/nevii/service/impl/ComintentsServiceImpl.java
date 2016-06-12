package com.nevii.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nevii.model.Comintents;
import com.nevii.servic.ComintentsService;

@Service("comintentsService")
@Transactional
public class ComintentsServiceImpl implements ComintentsService {


	public void passwordComintents(Comintents comint,long number) {
		
			long comin=number++;
			comint.setPassword(comin);
	
	}

	

}
