package com.nevii.pdf;

import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Report;

public class PDFCreatorFacillities implements PDFReportFacillities {
	
	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportFacillities#roofCover(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void roofCover(Report report, PdfPTable protectionTable) {
		if(report.getFacilitiesReport().getRoofCover().equals("Crep")){
			protectionTable.addCell(new Phrase("Krovni pokrivac je od crepa."));
		}else if(report.getFacilitiesReport().getRoofCover().equals("Paneli od straklene vune")){
			protectionTable.addCell(new Phrase("Krovni pokrivac je od panela od straklene vune."));
		}else if(report.getFacilitiesReport().getRoofCover().equals("Paneli od poliuretana")){
			protectionTable.addCell(new Phrase("Krovni pokrivac je od panela od poliuretana."));
		}else if(report.getFacilitiesReport().getRoofCover().equals("Sendvic lim")){
			protectionTable.addCell(new Phrase("Krovni pokrivac je od sendvic lima."));
		}
	}


	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportFacillities#roofConstruction(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void roofConstruction(Report report, PdfPTable protectionTable) {
		if(report.getFacilitiesReport().getRoofConstruction().equals("Betonska")){
			protectionTable.addCell(new Phrase("Krovna konstrukcija je betonska."));
		}else if(report.getFacilitiesReport().getRoofConstruction().equals("Celicna")){
			protectionTable.addCell(new Phrase("Krovna konstrukcija je celicna."));
		}else if(report.getFacilitiesReport().getRoofConstruction().equals("Drvena")){
			protectionTable.addCell(new Phrase("Krovna konstrukcija je drvena."));
		}
	}


	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportFacillities#exteriorWalls(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void exteriorWalls(Report report, PdfPTable protectionTable) {
		if(report.getFacilitiesReport().getExteriorWalls().equals("Cigla")){
			protectionTable.addCell(new Phrase("Spoljni zidovi objekata su od cigle"));
		}else if(report.getFacilitiesReport().getExteriorWalls().equals("Beton")){
			protectionTable.addCell(new Phrase("Spoljni zidovi objekata su od betona"));
		}else if(report.getFacilitiesReport().getExteriorWalls().equals("Paneli od straklene vune")){
			protectionTable.addCell(new Phrase("Spoljni zidovi objekata su paneli od straklene vune"));
		}else if(report.getFacilitiesReport().getExteriorWalls().equals("Paneli od straklene vune")){
			protectionTable.addCell(new Phrase("Spoljni zidovi objekata su paneli od poliuretana"));
		}else if(report.getFacilitiesReport().getExteriorWalls().equals("Paneli od straklene vune")){
			protectionTable.addCell(new Phrase("Spoljni zidovi objekata su od drvenih ploca"));
		}
	}


	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportFacillities#objectConstruction(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void objectConstruction(Report report, PdfPTable protectionTable) {
		if(report.getFacilitiesReport().getObjectConstruction().equals("Betonska")){
			protectionTable.addCell(new Phrase("Osnovna konstrukcija objekata je betonska."));
		}else if(report.getFacilitiesReport().getObjectConstruction().equals("Celicna")){
			protectionTable.addCell(new Phrase("Osnovna konstrukcija objekata je celicna."));
		}else if(report.getFacilitiesReport().getObjectConstruction().equals("Drvena")){
			protectionTable.addCell(new Phrase("Osnovna konstrukcija objekata je drvena."));
			
		}
	}


	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportFacillities#neighbors(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void neighbors(Report report, PdfPTable protectionTable) {
		if(report.getFacilitiesReport().getNeighbor().getNeighborsPresence().equals("Da")){
			protectionTable.addCell(new Phrase("Susedni objekti su na razdaljini od 20 m."));
		}else if(report.getFacilitiesReport().getNeighbor().getNeighborsPresence().equals("Ne"))
			protectionTable.addCell(new Phrase("Susedni objekti su na razdaljini manjoj od 20 m."));{
			
		}
	}


	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportFacillities#accessLocation(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void accessLocation(Report report, PdfPTable protectionTable) {
		if(report.getFacilitiesReport().getAccessLocation().equals("sa sve 4 strane")){
			protectionTable.addCell(new Phrase("Objekti su pristupacni sa sve 4 strane"));
		}else if(report.getFacilitiesReport().getAccessLocation().equals("sa 3 strane")){
			protectionTable.addCell(new Phrase("Objekti su pristupacni sa 3 strane"));
		}else if(report.getFacilitiesReport().getAccessLocation().equals("sa 2 strane")){
			protectionTable.addCell(new Phrase("Objekti su pristupacni sa 2 strane"));
		}
	}

}
