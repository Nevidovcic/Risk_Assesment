package com.nevii.pdf;

import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Report;

public interface PDFReportControll {

	/**
	 * @param report
	 * @param controllTable
	 */
	void controlOfSafteyValves(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void controlOfBoilerUnderPress(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void controlOfPressureVessel(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void controlOfGasInst(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void controlOfPropanButanInst(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void controlOfElectrInst(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void cleanliness(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void smokingProhibition(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void forklift(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void storageBottleUnderPress(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void trainingEmployers(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void regulationOfFelding(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void planOfFireProtection(Report report, PdfPTable controllTable);

	/**
	 * @param report
	 * @param controllTable
	 */
	void categoriesOfFireRisk(Report report, PdfPTable controllTable);

}