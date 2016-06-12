package com.nevii.pdf;

import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Report;

public interface PDFReportProtection {

	/**
	 * @param report
	 * @param protectionTable
	 */
	void videoSurvey(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void fencedAndIlluminated(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void fireBrigade(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void fireProtectionMan(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void hydrant(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @return
	 */
	boolean reportHydrant(Report report);

	/**
	 * @param report
	 * @return
	 */
	boolean reportHydrant2(Report report);

	/**
	 * @param report
	 * @return
	 */
	boolean reportHydrant3(Report report);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void security(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void theftSystem(Report report, PdfPTable protectionTable);
	
	/**
	 * @param report
	 * @param protectionTable
	 */
	void fireFightingInstal(Report report, PdfPTable protectionTable);
	
	/**
	 * @param report
	 * @param protectionTable
	 */
	void fireExtinguisher(Report report, PdfPTable protectionTable);
	
	/**
	 * @param report
	 * @param protectionTable
	 */
	void lightingConductor(Report report, PdfPTable protectionTable);
	
	/**
	 * @param report
	 * @param protectionTable
	 */
	public void fireAlarm(Report report, PdfPTable protectionTable);

}