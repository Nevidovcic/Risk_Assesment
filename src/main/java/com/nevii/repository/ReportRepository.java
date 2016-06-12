package com.nevii.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nevii.model.Report;

@Repository("reportRepository")
public interface ReportRepository extends JpaRepository<Report, Long> {
	
@Query("Select r from Report r where r.numbReport=?1 and r.year=?2 ")
Report findByNumbReportAndYearReport(Long numbReport,Integer year);

List<Report> findByNumbReportAndYear(Long numbreport,Integer year);

List<Report> findByDateReportBetween(Date startDate,Date endDate);
}
