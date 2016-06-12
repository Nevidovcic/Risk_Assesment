package com.nevii.pdf;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.nevii.model.Report;


public class PDFDocument extends AbstractPdfView  {
	
	
	//promeniti
	PDFReportProtection pdfCreation= new PDFCreation();
	PDFReportFacillities pdfFacilities= new PDFCreatorFacillities();
	PDFReportEx pdfEx=new PDFCreationEX();
	PDFReportControll pdfControll=new PDFCreationControll();


	
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Report report=(Report) model.get("report");

		Paragraph title = new Paragraph(new Chunk("IZVESTAJ PROCENE RIZIKA OD POZARA ",FontFactory.getFont(FontFactory.HELVETICA, 25)));
		title.setAlignment(Element.ALIGN_CENTER);
		title.setSpacingAfter(30);
		
		Paragraph brojIzvestaja = new Paragraph(new Chunk("Broj izvestaja:"+String.valueOf(report.toString()),FontFactory.getFont(FontFactory.HELVETICA, 12)));
		brojIzvestaja.setAlignment(Element.ALIGN_LEFT);
		
		Paragraph datum = new Paragraph(new Chunk("Datum:"+String.valueOf(report.getDateReport() ),FontFactory.getFont(FontFactory.HELVETICA, 12)));
		datum.setAlignment(Element.ALIGN_RIGHT);
		
		//klijent tabela
		PdfPTable comintentTable = new PdfPTable(2);
		
		comintentTable.addCell(new Phrase("Naziv klijenta:"));
		comintentTable.addCell(new Phrase(report.getComintentnsReport().getName()));//dodati iz klijenta
		comintentTable.addCell(new Phrase("PIB:"));
		comintentTable.addCell(new Phrase(String.valueOf(report.getComintentnsReport().getPib())));
		comintentTable.addCell(new Phrase("Maticni broj:"));
		comintentTable.addCell(new Phrase(String.valueOf(report.getComintentnsReport().getMb())));
		comintentTable.addCell(new Phrase("Delatnost:"));
		comintentTable.addCell(new Phrase(report.getComintentnsReport().getActivityOfCompany()));
		
		comintentTable.setSpacingAfter(40);
		
		//parametri
		PdfPTable parameterTable = new PdfPTable(7);
		
		PdfPCell param = new PdfPCell(new Phrase("Parametri"));
		param.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		param.setColspan(3);
	
		
		PdfPCell rating = new PdfPCell(new Phrase("Procena"));
		rating.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		rating.setColspan(4);
		rating.setMinimumHeight(15f);
		rating.setLeading(0f, 1.2f);
		
		parameterTable.addCell(param);
		parameterTable.addCell(new Phrase("Zastitne mere"));
		parameterTable.addCell(new Phrase("Gradjevinski objekti,pogodnost lokacije"));
		parameterTable.addCell(new Phrase("Posvecenost i kontrola"));
		parameterTable.addCell(new Phrase("Ex izvedba"));
		
		parameterTable.addCell(rating);
		
		
		
		parameterTable.setSpacingAfter(40);
		
		
		//fireProtection table
		PdfPTable protectionTable = new PdfPTable(2);	
		
		PdfPCell header1 = new PdfPCell(new Phrase("ZASTITNE MERE"));
		header1.setHorizontalAlignment(Element.ALIGN_LEFT);
		header1.setColspan(2);
				
		protectionTable.addCell(header1);
		
		
		protectionTable.addCell(new Phrase("Osvetljenost i ogradjenost:"));
		pdfCreation.fencedAndIlluminated(report, protectionTable);
				
		protectionTable.addCell(new Phrase("Udaljenost VJ:"));
		pdfCreation.fireBrigade(report, protectionTable);
						
		protectionTable.addCell(new Phrase("Cuvarska sluzba:"));
		pdfCreation.security(report, protectionTable);
				
		protectionTable.addCell(new Phrase("Lice zaduzeno za PP zastitu:"));
		pdfCreation.fireProtectionMan(report, protectionTable);
						
		protectionTable.addCell(new Phrase("Hidrantska mreza:"));
		pdfCreation.hydrant(report, protectionTable);
						
		protectionTable.addCell(new Phrase("PP aparati:"));
		pdfCreation.fireExtinguisher(report, protectionTable);
				
		protectionTable.addCell(new Phrase("Gromobranska instalacija:"));
		pdfCreation.lightingConductor(report, protectionTable);
		
		protectionTable.addCell(new Phrase("Stabilna instalacija za dojavu pozara:"));
		pdfCreation.fireAlarm(report, protectionTable);
		
		protectionTable.addCell(new Phrase("Stabilna instalacija za gasenje pozara:"));
		pdfCreation.fireFightingInstal(report, protectionTable);
				
				
		protectionTable.addCell(new Phrase("Protivprovalni sistem:"));
		pdfCreation.theftSystem(report, protectionTable);
								
		protectionTable.addCell(new Phrase("Video nadzor:"));
		pdfCreation.videoSurvey(report, protectionTable);
			
		protectionTable.setSpacingAfter(30);
		
		//tabela objekti	
		PdfPTable facilities = new PdfPTable(2);	
		
		PdfPCell header2 = new PdfPCell(new Phrase("GRADJEVINSKI OBJEKTI,POGODNOST LOKACIJE"));
		header2.setHorizontalAlignment(Element.ALIGN_LEFT);
		header2.setColspan(2);
				
		facilities.addCell(header2);
		
		facilities.addCell(new Phrase("Pristupacnost objektima:"));
		pdfFacilities.accessLocation(report, facilities);
				
		facilities.addCell(new Phrase("Susedni objekti:"));
		pdfFacilities.neighbors(report, facilities);
		
		facilities.addCell(new Phrase("Osnovna konsktrukcija:"));
		pdfFacilities.objectConstruction(report, facilities);
				
		facilities.addCell(new Phrase("Spoljni zidovi:"));
		pdfFacilities.exteriorWalls(report, facilities);
				
		facilities.addCell(new Phrase("Krovna konstrukcija:"));
		pdfFacilities.roofConstruction(report, facilities);
				
		facilities.addCell(new Phrase("Krovni pokrivac:"));
		pdfFacilities.roofCover(report, facilities);
				
		facilities.setSpacingAfter(30);
		
		//Controll tabela
		
		PdfPTable controllTable = new PdfPTable(2);	
		
		PdfPCell controllHeader = new PdfPCell(new Phrase("POSVECENOST I KONTROLA"));
		controllHeader.setHorizontalAlignment(Element.ALIGN_LEFT);
		controllHeader.setColspan(2);
				
		controllTable.addCell(controllHeader);
		
		controllTable.addCell(new Phrase("Kategorija ugrozenosti od pozara:"));
		pdfControll.categoriesOfFireRisk(report, controllTable);
		
		controllTable.addCell(new Phrase("Plan/Pravila zastita od pozara:"));
		pdfControll.planOfFireProtection(report, controllTable);
				
		controllTable.addCell(new Phrase("Uredba o mestima za privremeno zavarivanje:"));
		pdfControll.regulationOfFelding(report, controllTable);
				
		controllTable.addCell(new Phrase("Obuka i provera znanja zaposlenih,plan obuke:"));
		pdfControll.trainingEmployers(report, controllTable);
				
		controllTable.addCell(new Phrase("Skladistenje boca pod pritiskom:"));
		pdfControll.storageBottleUnderPress(report, controllTable);
				
		controllTable.addCell(new Phrase("Punjenje elektronskih viljuskara:"));
		pdfControll.forklift(report, controllTable);
				
		controllTable.addCell(new Phrase("Zabrana pusenja:"));
		pdfControll.smokingProhibition(report, controllTable);
				
		controllTable.addCell(new Phrase("Cistoca objekata:"));
		pdfControll.cleanliness(report, controllTable);
				
		PdfPCell controll = new PdfPCell(new Phrase("Kontrole"));
		controll.setHorizontalAlignment(Element.ALIGN_LEFT);
		controll.setColspan(2);
				
		controllTable.addCell(controll);
		
		controllTable.addCell(new Phrase("Elektricne instalacije niskog napona:"));
		pdfControll.controlOfElectrInst(report, controllTable);
				
		controllTable.addCell(new Phrase("Propan butan instalacije:"));
		pdfControll.controlOfPropanButanInst(report, controllTable);
			
		controllTable.addCell(new Phrase("Gasne instalacije:"));
		pdfControll.controlOfGasInst(report, controllTable);
			
		controllTable.addCell(new Phrase("Posude pod pritiskom:"));
		pdfControll.controlOfPressureVessel(report, controllTable);
				
		controllTable.addCell(new Phrase("Kotlovi pod pritiskom:"));
		pdfControll.controlOfBoilerUnderPress(report, controllTable);
				
		controllTable.addCell(new Phrase("Ventili sigurnosti:"));
		pdfControll.controlOfSafteyValves(report, controllTable);
		
		controllTable.setSpacingAfter(30);
		
		//Ex table
		
		PdfPTable exTable = new PdfPTable(2);	
		
		PdfPCell exHeader = new PdfPCell(new Phrase("EX IZVEDBA"));
		exHeader.setHorizontalAlignment(Element.ALIGN_LEFT);
		exHeader.setColspan(2);
				
		exTable.addCell(exHeader);
		
		
		exTable.addCell(new Phrase("Elaborat o zonama opasnosti:"));
		pdfEx.studyOfDangerosZone(report, exTable);
				
		exTable.addCell(new Phrase("Radnici sa Ex sertifikatom:"));
		pdfEx.exCertificate(report, exTable);
				
		exTable.addCell(new Phrase("Kontrolisanje opreme:"));
		pdfEx.controlExEquipment(report, exTable);
				
		exTable.addCell(new Phrase("Instalacija za detekciju gasova:"));
		pdfEx.instalationExGasDetection(report, exTable);
				
		exTable.addCell(new Phrase("Kontrola instalacije za gasove:"));
		pdfEx.controlExGasdetection(report, exTable);
				
		exTable.addCell(new Phrase("Zastita od elektronskog prenapona:"));
		pdfEx.protectionOElectricalOvervoltage(report, exTable);
			
		exTable.setSpacingAfter(30);
		
		document.add(title);
		document.add(brojIzvestaja);
		document.add(datum);
		document.add(comintentTable);
		document.add(parameterTable);
		
		document.add(protectionTable);
		document.add(facilities);
		document.add(exTable);
		document.add(controllTable);
		document.setPageCount(3);
	
	}

	


}
