package com.nevii.servicejpa.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nevii.exception.MbComintentException;
import com.nevii.model.Comintents;
import com.nevii.repository.ComintentsRepository;
import com.nevii.servicejpa.ComintentsServiceJpa;
import com.nevii.servicejpa.CommonServiceJpa;

@Service("comintentsServiceJpa")
@Transactional
public class ComintentsServiceJpaImpl implements  CommonServiceJpa<Comintents, Long>,ComintentsServiceJpa  {

	@Autowired
	private ComintentsRepository cominRepository;
	
	@Override
	public Comintents save(Comintents entity) throws MbComintentException{
		
						
	return cominRepository.save(entity);
	}

	@Override
	public Comintents update(Comintents entity) {
		
		return cominRepository.saveAndFlush(entity);
	}

	@Override
	public void delete(Comintents entity) {
		cominRepository.delete(entity);
		
	}

	@Override
	public Comintents findById(Long id) {
		
		return cominRepository.findOne(id);
	}

	@Override
	public List<Comintents> findAll() {
		
		return cominRepository.findAll();
	}

	@Override
	public Comintents findByPass(Long pass) {
		
		return cominRepository.findByPassword(pass);
	}

	@Override
	public Comintents findByName(String name) {
		
		return cominRepository.findByName(name);
	}

	@Override
	public Comintents findByMb(int mb) {
		
		return cominRepository.findByMb(mb);
	}

	@Override
	public Comintents findByPib(int pib) {
	
		return cominRepository.findByPib(pib);
	}

	
	public boolean comintenExist(Long mb) {
    Comintents comintent = cominRepository.findOne(mb);
    if (comintent != null) {
        return true;
    }
    return false;
}

	




}
