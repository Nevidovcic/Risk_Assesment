package com.nevii.pdf;

import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Report;

public class PDFCreationEX implements PDFReportEx {


	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportEx#protectionOElectricalOvervoltage(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void protectionOElectricalOvervoltage(Report report, PdfPTable exTable) {
		if(report.getExReport().getProtectionOfElectricalOvervoltage().equals("Da")){
			exTable.addCell(new Phrase("Na lokaciji postoji zastita od elektronskog prenapona."));
		}else if(report.getExReport().getProtectionOfElectricalOvervoltage().equals("Da")){
			exTable.addCell(new Phrase("Na lokaciji ne postoji zastita od elektronskog prenapona."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportEx#instalationExGasDetection(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void instalationExGasDetection(Report report, PdfPTable exTable) {
		if(report.getExReport().getInstalationExGasDetection().equals("Da")){
			exTable.addCell(new Phrase("Na lokaciji postoji instalacija za detekciju gasova."));
		}else if(report.getExReport().getInstalationExGasDetection().equals("Da")){
			exTable.addCell(new Phrase("Na lokaciji ne postoji instalacija za detekciju gasova."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportEx#controlExGasdetection(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void controlExGasdetection(Report report, PdfPTable exTable) {
		if(report.getExReport().getControlExGasDetection().equals("Da")){
			exTable.addCell(new Phrase("Instalacija za detekciju gasova se kontrolise redovno."));
		}else if(report.getExReport().getControlExGasDetection().equals("Ne")){
			exTable.addCell(new Phrase("Instalacija za detekciju gasova se ne kontrolise redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportEx#controlExEquipment(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void controlExEquipment(Report report, PdfPTable exTable) {
		if(report.getExReport().getControlExEquipment().equals("Da")){
			exTable.addCell(new Phrase("Kontrola Ex opreme se vrsi redovno."));
		}else if(report.getExReport().getControlExEquipment().equals("Ne")){
			exTable.addCell(new Phrase("Kontrola Ex opreme se ne vrsi redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportEx#exCertificate(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void exCertificate(Report report, PdfPTable exTable) {
		if(report.getExReport().getExCertificate().equals("Da")){
			exTable.addCell(new Phrase("Radnici koji rukuju Ex opremom imaju polozen ispit."));
		}else if(report.getExReport().getExCertificate().equals("Ne")){
			exTable.addCell(new Phrase("Radnici koji rukuju Ex opremom nemaju polozen ispit."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportEx#studyOfDangerosZone(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void studyOfDangerosZone(Report report, PdfPTable exTable) {
		if(report.getExReport().getStudyOfDangerosZone().equals("Da")){
			exTable.addCell(new Phrase("Elaborat o zonama opasnosti je izradjen."));
		}else if(report.getExReport().getStudyOfDangerosZone().equals("Ne")){
			exTable.addCell(new Phrase("Elaborat o zonama opasnosti nije izradjen."));
		}
	}
}
