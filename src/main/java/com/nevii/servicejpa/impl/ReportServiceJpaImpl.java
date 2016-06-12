package com.nevii.servicejpa.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nevii.model.Report;
import com.nevii.repository.ReportRepository;
import com.nevii.servicejpa.CommonServiceJpa;
import com.nevii.servicejpa.ReportServiceJpa;

@Service("reportServiceJpa")
@Transactional
public class ReportServiceJpaImpl implements CommonServiceJpa<Report, Long>,ReportServiceJpa{

	@Autowired
	ReportRepository reportRepository;
	

	@Override
	public Report save(Report entity) {
		
		return reportRepository.save(entity);
	}

	@Override
	public Report update(Report entity) {
		
		return reportRepository.saveAndFlush(entity);
	}

	@Override
	public void delete(Report entity) {
		reportRepository.delete(entity);
	}

	@Override
	public Report findById(Long id) {
		
		return reportRepository.findOne(id);
	}

	@Override
	public List<Report> findAll() {
		
		return reportRepository.findAll();
	}

	@Override
	public Report findByNumbReportAndYear(Long numbReport, Integer year) {
		
		return reportRepository.findByNumbReportAndYearReport(numbReport, year);
	}

	@Override
	public List<Report> findByNumbReportAndYearReport(Long numbreport, Integer year) {
		
		return reportRepository.findByNumbReportAndYear(numbreport, year);
	}

	@Override
	public List<Report> findByDateReportBetween(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return reportRepository.findByDateReportBetween(startDate, endDate);
	}

	
	

	
}
