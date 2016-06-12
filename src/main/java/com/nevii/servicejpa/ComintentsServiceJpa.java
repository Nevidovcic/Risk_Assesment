package com.nevii.servicejpa;





import com.nevii.model.Comintents;

public interface ComintentsServiceJpa {
		
	Comintents findByPass(Long pass);
	
	Comintents findByName(String name);
	
	Comintents findByMb(int mb);
	
	Comintents findByPib(int pib);

	
}
