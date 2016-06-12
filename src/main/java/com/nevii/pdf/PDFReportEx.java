package com.nevii.pdf;

import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Report;

public interface PDFReportEx {

	/**
	 * @param report
	 * @param exTable
	 */
	void protectionOElectricalOvervoltage(Report report, PdfPTable exTable);

	/**
	 * @param report
	 * @param exTable
	 */
	void instalationExGasDetection(Report report, PdfPTable exTable);

	/**
	 * @param report
	 * @param exTable
	 */
	void controlExGasdetection(Report report, PdfPTable exTable);

	/**
	 * @param report
	 * @param exTable
	 */
	void controlExEquipment(Report report, PdfPTable exTable);

	/**
	 * @param report
	 * @param exTable
	 */
	void exCertificate(Report report, PdfPTable exTable);

	/**
	 * @param report
	 * @param exTable
	 */
	void studyOfDangerosZone(Report report, PdfPTable exTable);

}