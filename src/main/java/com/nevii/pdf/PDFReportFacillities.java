package com.nevii.pdf;

import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Report;

public interface PDFReportFacillities {

	/**
	 * @param report
	 * @param protectionTable
	 */
	void roofCover(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void roofConstruction(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void exteriorWalls(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void objectConstruction(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void neighbors(Report report, PdfPTable protectionTable);

	/**
	 * @param report
	 * @param protectionTable
	 */
	void accessLocation(Report report, PdfPTable protectionTable);

}