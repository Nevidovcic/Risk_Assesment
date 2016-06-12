package com.nevii.pdf;

import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Report;

public class PDFCreationControll implements PDFReportControll {

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#controlOfSafteyValves(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void controlOfSafteyValves(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getControls().getControlOfSafteyValves().equals("Da")&&
				report.getRiskReport().getControls().getControlOfSafteyValvesSatisfies().equals("Da")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfSafteyValves().equals("Da")&&
		report.getRiskReport().getControls().getControlOfSafteyValvesSatisfies().equals("Ne")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je ne zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfSafteyValves().equals("Ne")){
			
			controllTable.addCell(new Phrase("Kontrola se ne vrsi redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#controlOfBoilerUnderPress(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void controlOfBoilerUnderPress(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getControls().getControlOfBoilerUnderPress().equals("Da")&&
				report.getRiskReport().getControls().getControlOfBoilerUnderPressSatisfies().equals("Da")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfBoilerUnderPress().equals("Da")&&
		report.getRiskReport().getControls().getControlOfBoilerUnderPressSatisfies().equals("Ne")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je ne zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfBoilerUnderPress().equals("Ne")){
			
			controllTable.addCell(new Phrase("Kontrola se ne vrsi redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#controlOfPressureVessel(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void controlOfPressureVessel(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getControls().getControlOfPressureVessel().equals("Da")&&
				report.getRiskReport().getControls().getControlOfPressureVesselSatisfies().equals("Da")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfPressureVessel().equals("Da")&&
		report.getRiskReport().getControls().getControlOfPressureVesselSatisfies().equals("Ne")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je ne zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfPressureVessel().equals("Ne")){
			
			controllTable.addCell(new Phrase("Kontrola se ne vrsi redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#controlOfGasInst(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void controlOfGasInst(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getControls().getControlOfGasInst().equals("Da")&&
				report.getRiskReport().getControls().getControlOfGasInstSatisfies().equals("Da")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfGasInst().equals("Da")&&
		report.getRiskReport().getControls().getControlOfGasInstSatisfies().equals("Ne")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je ne zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfGasInst().equals("Ne")){
			
			controllTable.addCell(new Phrase("Kontrola se ne vrsi redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#controlOfPropanButanInst(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void controlOfPropanButanInst(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getControls().getControlOfPropanButanInst().equals("Da")&&
				report.getRiskReport().getControls().getControlOfPropanButanInstSatisfies().equals("Da")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfPropanButanInst().equals("Da")&&
		report.getRiskReport().getControls().getControlOfPropanButanInstSatisfies().equals("Ne")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je ne zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfPropanButanInst().equals("Ne")){
			
			controllTable.addCell(new Phrase("Kontrola se ne vrsi redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#controlOfElectrInst(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void controlOfElectrInst(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getControls().getControlOfElectrInst().equals("Da")&&
				report.getRiskReport().getControls().getControlOfElectrInstSatisfies().equals("Da")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfElectrInst().equals("Da")&&
		report.getRiskReport().getControls().getControlOfElectrInstSatisfies().equals("Ne")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi kontrola.Zakljucak prema izvestaju je ne zadovoljava."));
		}else if(report.getRiskReport().getControls().getControlOfElectrInst().equals("Ne")){
			
			controllTable.addCell(new Phrase("Kontrola se ne vrsi redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#cleanliness(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void cleanliness(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getCleanliness().equals("Da")){
			controllTable.addCell(new Phrase("Cistoca je na zadovoljavajucem nivou."));
		}else if(report.getRiskReport().getCleanliness().equals("Ne")){
			controllTable.addCell(new Phrase("Cistoca je nije na zadovoljavajucem nivou."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#smokingProhibition(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void smokingProhibition(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getSmokingProhibition().equals("Da")){
			
			controllTable.addCell(new Phrase("Zabrana pusenja se postuje."));
		}else if(report.getRiskReport().getSmokingProhibition().equals("Ne")){
			
			controllTable.addCell(new Phrase("Zabrana pusenja se ne postuje."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#forklift(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void forklift(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getForklift().equals("Da")){
			
			controllTable.addCell(new Phrase("Elektronski viljuskari se pune van objekata."));
		}else if(report.getRiskReport().getForklift().equals("Ne")){
			
			controllTable.addCell(new Phrase("Elektronski viljuskari se ne pune van objekata."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#storageBottleUnderPress(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void storageBottleUnderPress(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getStorageBottleUnderPress().equals("Da")){
			
			controllTable.addCell(new Phrase("Boce pod pritiskom se skladiste na pravilan nacin."));
		}else if(report.getRiskReport().getStorageBottleUnderPress().equals("Ne")){
			controllTable.addCell(new Phrase("Boce pod pritiskom se ne skladiste na pravilan nacin."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#trainingEmployers(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void trainingEmployers(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getTrainingEmployers().equals("Da")){
			
			controllTable.addCell(new Phrase("Redovno se vrsi obuka i provera znanja zaposlenih."
					+ "Donesen je plan obuke."));
		}else if(report.getRiskReport().getTrainingEmployers().equals("Ne")){
			
			controllTable.addCell(new Phrase("Obuka zaposlenih se ne vrsi redovno."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#regulationOfFelding(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void regulationOfFelding(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getRegulationOfFelding().equals("Da")){
			
			controllTable.addCell(new Phrase("Klijent sprovodi odredbe uredbe."));
		}else if(report.getRiskReport().getRegulationOfFelding().equals("Ne")){
			
			controllTable.addCell(new Phrase("Klijent ne sprovodi odredbe uredbe."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#planOfFireProtection(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void planOfFireProtection(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getPlanOfFireProtec().equals("Da")&&
				(report.getRiskReport().getCategoriesOfFireRisk().equals("I")||
						report.getRiskReport().getCategoriesOfFireRisk().equals("II"))){
			controllTable.addCell(new Phrase("Klijent poseduje Plan ZOP."));
		}else if(report.getRiskReport().getPlanOfFireProtec().equals("Da")&&
				report.getRiskReport().getCategoriesOfFireRisk().equals("III")
						){
			controllTable.addCell(new Phrase("Klijent poseduje Pravila ZOP."));
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReportControll#categoriesOfFireRisk(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void categoriesOfFireRisk(Report report, PdfPTable controllTable) {
		if(report.getRiskReport().getCategoriesOfFireRisk().equals("I")||
			report.getRiskReport().getCategoriesOfFireRisk().equals("II")||
			report.getRiskReport().getCategoriesOfFireRisk().equals("III")){
			controllTable.addCell(new Phrase("Klijent je razvrstan u "+
			report.getRiskReport().getCategoriesOfFireRisk()+"kategoriju."));
		}
	}


}
