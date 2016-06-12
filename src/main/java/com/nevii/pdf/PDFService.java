package com.nevii.pdf;

import com.nevii.model.Report;


public interface PDFService {


	/**
	 * @param reviewRepoNum
	 * @return
	 */
	public Report pdfReview(String reviewRepoNum);

}