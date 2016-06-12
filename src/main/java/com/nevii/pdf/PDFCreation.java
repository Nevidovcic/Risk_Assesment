package com.nevii.pdf;


import org.springframework.stereotype.Component;

import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Report;

@Component
public class PDFCreation implements PDFReportProtection {

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#videoSurvey(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void fireFightingInstal(Report report, PdfPTable protectionTable) {
		

	
		try {
			if(report.getProtectionReport().getFireFightingIns().getFireFigtingInstal().equals("Da")&&
					report.getProtectionReport().getFireFightingIns().getFireFigtingInstFunct().equals("Da")&&
					report.getProtectionReport().getFireFightingIns().getFireFigtingInstProbe().equals("Da")){
				
				protectionTable.addCell(new Phrase("Na lokaciji postoji Stabilna instalacija za gasenje pozara koja je funkcionalna.Vrsi se redovno ispitivanje ispravnosti. "));
			}else if(report.getProtectionReport().getFireFightingIns().getFireFigtingInstal().equals("Da")&&
					report.getProtectionReport().getFireFightingIns().getFireFigtingInstFunct().equals("Ne")&&
					report.getProtectionReport().getFireFightingIns().getFireFigtingInstProbe().equals("Ne")){
				
				protectionTable.addCell(new Phrase("Na lokaciji postoji stabilna instalacija za gasenje pozara.Instalacija nije funkcionalna i ne vrsi se redovno ispitivanje ispravnosti."));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#videoSurvey(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void videoSurvey(Report report, PdfPTable protectionTable) {
		try {
			if(report.getProtectionReport().getVideoSurve().equals("Da")){
				protectionTable.addCell(new Phrase("Na lokaciji postoji video nadzor."));
			}else if(report.getProtectionReport().getVideoSurve().equals("Ne")){
				protectionTable.addCell(new Phrase("Na lokaciji ne postoji video nadzor."));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#fencedAndIlluminated(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void fencedAndIlluminated(Report report, PdfPTable protectionTable){
		try {
			if(report.getProtectionReport().getFenced().equals("Da")&&report.getProtectionReport().getIlluminated().equals("Da")){
				protectionTable.addCell(new Phrase("Lokacija je ogradjena i osvetljena."));
			}else if(report.getProtectionReport().getFenced().equals("Da")&&report.getProtectionReport().getIlluminated().equals("Ne")){
				protectionTable.addCell(new Phrase("Lokacija je ogradjena ali nije osvetljena."));
			}else if(report.getProtectionReport().getFenced().equals("Ne")&&report.getProtectionReport().getIlluminated().equals("Da")){
				protectionTable.addCell(new Phrase("Lokacija nije ogradjena ali je osvetljena."));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#fireBrigade(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void fireBrigade(Report report, PdfPTable protectionTable) {
		try {
			if(report.getProtectionReport().getFireBrigade().equals("Da")){
				protectionTable.addCell(new Phrase("Vatrogasna jedinica je udaljena do 5 km."));
			}else if(report.getProtectionReport().getFireBrigade().equals("Ne")){
				protectionTable.addCell(new Phrase("Vatrogasna jedinica je udaljena vise od 5 km."));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#fireProtectionMan(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void fireProtectionMan(Report report, PdfPTable protectionTable) {
		try {
			if(report.getProtectionReport().getFireProtectionMan().equals("Da")){
				protectionTable.addCell(new Phrase("Postoji lice koje je zaduzeno za PP zastitu."));
			}else if(report.getProtectionReport().getFireProtectionMan().equals("Ne")){
				protectionTable.addCell(new Phrase("Lice koje je zaduzeno za PP zastitu nije imenovano."));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#hydrant(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void hydrant(Report report, PdfPTable protectionTable) {
		try {
			if(reportHydrant(report)){
				
				protectionTable.addCell(new Phrase("Na lokaciji postoji hidrantska mreza koja se redovno ispituje."
						+ "Pritisak je iznad 2.5 bar-a.Svi ormani su pristupacni i dobro opremljeni."));
			}else if(report.getProtectionReport().getHydrant().getHydrants().equals("Ne")){
				protectionTable.addCell(new Phrase("Hidrantska mreza nije izvedena na lokaciji."));
			}else if(reportHydrant2(report)){
				
				protectionTable.addCell(new Phrase("Na lokaciji postoji hidrantska mreza koja se redovno ispituje."
						+ "Pritisak je iznad 2.5 bar-a.Svi ormani nisu pristupacni i nisu dobro opremljeni."));
			}else if(reportHydrant3(report)){
				
				protectionTable.addCell(new Phrase("Na lokaciji postoji hidrantska mreza koja se redovno ispituje."
						+ "Pritisak je ispod 2.5 bar-a.Svi ormani su pristupacni i dobro opremljeni."));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#reportHydrant(com.nevii.model.Report)
	 */
	@Override
	public boolean reportHydrant(Report report) {
		return report.getProtectionReport().getHydrant().getHydrants().equals("Da")&&
			report.getProtectionReport().getHydrant().getHydrantsPressure().equals("Da")&&
			report.getProtectionReport().getHydrant().getHydrantsCabAffordable().equals("Da")&&
			report.getProtectionReport().getHydrant().getHydrantsCabEqquiped().equals("Da");
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#reportHydrant2(com.nevii.model.Report)
	 */
	@Override
	public boolean reportHydrant2(Report report) {
		return report.getProtectionReport().getHydrant().getHydrants().equals("Da")&&
				report.getProtectionReport().getHydrant().getHydrantsPressure().equals("Da")&&
				report.getProtectionReport().getHydrant().getHydrantsCabAffordable().equals("Ne")&&
				report.getProtectionReport().getHydrant().getHydrantsCabEqquiped().equals("Ne");
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#reportHydrant3(com.nevii.model.Report)
	 */
	@Override
	public boolean reportHydrant3(Report report) {
		return report.getProtectionReport().getHydrant().getHydrants().equals("Da")&&
				report.getProtectionReport().getHydrant().getHydrantsPressure().equals("Ne")&&
				report.getProtectionReport().getHydrant().getHydrantsCabAffordable().equals("Da")&&
				report.getProtectionReport().getHydrant().getHydrantsCabEqquiped().equals("Da");
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#security(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void security(Report report, PdfPTable protectionTable) {
		try {
			if(report.getProtectionReport().getSecurity().equals("Da")){
				protectionTable.addCell(new Phrase("Na lokaciji postoji cuvarska sluzba 24 casa."));
			}else if(report.getProtectionReport().getSecurity().equals("Ne")){
				protectionTable.addCell(new Phrase("Na lokaciji ne postoji cuvarska sluzba 24 casa."));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#theftSystem(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void theftSystem(Report report, PdfPTable protectionTable) {
		try {
			if(report.getProtectionReport().getTheftSystem().equals("Da")){
				protectionTable.addCell(new Phrase("Na lokaciji postoji protivprovalni sistem."));
			}else if(report.getProtectionReport().getTheftSystem().equals("Ne")){
				protectionTable.addCell(new Phrase("Na lokaciji ne postoji protivprovalni sistem."));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see com.nevii.pdf.PDFReport#theftSystem(com.nevii.model.Report, com.lowagie.text.pdf.PdfPTable)
	 */
	@Override
	public void fireExtinguisher(Report report, PdfPTable protectionTable) {
		try {
			if(report.getProtectionReport().getFireExtinguisher().getFireExting().equals("Da")
				&&report.getProtectionReport().getFireExtinguisher().getFireExtingNumb().equals("Da")
				&&report.getProtectionReport().getFireExtinguisher().getFireExtingProbe().equals("Da")){
				protectionTable.addCell(new Phrase("Na lokaciji postoje PP aparati u dovoljnom broju.Ispitivanje ispravnosti se redovno vrsi."));
				
			}else if(report.getProtectionReport().getFireExtinguisher().getFireExting().equals("Ne")){
				protectionTable.addCell(new Phrase("Na lokaciji ne postoje PP aparati."));
					
			}else if(report.getProtectionReport().getFireExtinguisher().getFireExting().equals("Da")
					&&report.getProtectionReport().getFireExtinguisher().getFireExtingNumb().equals("Ne")
					&&report.getProtectionReport().getFireExtinguisher().getFireExtingProbe().equals("Ne")){
					protectionTable.addCell(new Phrase("Na lokaciji postoje PP aparati ali nisu u dovoljnom broju i ne vrsi se redovno ispitivanje ispravnosti."));
				
			}else if(report.getProtectionReport().getFireExtinguisher().getFireExting().equals("Da")
					&&report.getProtectionReport().getFireExtinguisher().getFireExtingNumb().equals("Ne")
					&&report.getProtectionReport().getFireExtinguisher().getFireExtingProbe().equals("Da")){
					protectionTable.addCell(new Phrase("Na lokaciji postoje PP aparati ali nisu u dovoljnom broju.Ispitivanje ispravnosti se redovno vrsi."));
				
			}else if(report.getProtectionReport().getFireExtinguisher().getFireExting().equals("Da")
					&&report.getProtectionReport().getFireExtinguisher().getFireExtingNumb().equals("Da")
					&&report.getProtectionReport().getFireExtinguisher().getFireExtingProbe().equals("Ne")){
					protectionTable.addCell(new Phrase("Na lokaciji postoje PP aparati ali nisu u dovoljnom broju.Ispitivanje ispravnosti se ne vrsi redovno."));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void lightingConductor(Report report, PdfPTable protectionTable) {
		if(report.getProtectionReport().getLightningConductor().getLightningRod().equals("Da")&&
			report.getProtectionReport().getLightningConductor().getLightningRodFunct().equals("Da")&&
			report.getProtectionReport().getLightningConductor().getLightningRodProbe().equals("Da")){
			
			protectionTable.addCell(new Phrase("Na lokaciji postoji gromobranska instalacija koja se ispituje redovno i fukcionalna je u svim delovima."));
		}else if(report.getProtectionReport().getLightningConductor().getLightningRod().equals("Ne")){
			protectionTable.addCell(new Phrase("Na lokaciji ne postoji gromobranska instalacija."));
		}else if(report.getProtectionReport().getLightningConductor().getLightningRod().equals("Da")&&
				report.getProtectionReport().getLightningConductor().getLightningRodFunct().equals("Ne")&&
				report.getProtectionReport().getLightningConductor().getLightningRodProbe().equals("Da")){
			
			protectionTable.addCell(new Phrase("Na lokaciji postoji gromobranska instalacija koja se ispituje redovno ali nije fukcionalna u svim delovima."));
		}else if(report.getProtectionReport().getLightningConductor().getLightningRod().equals("Da")&&
				report.getProtectionReport().getLightningConductor().getLightningRodFunct().equals("Ne")&&
				report.getProtectionReport().getLightningConductor().getLightningRodProbe().equals("Ne")){
			
			protectionTable.addCell(new Phrase("Na lokaciji postoji gromobranska instalacija koja se ne ispituje redovno i nije fukcionalna u svim delovima."));
		}
	}

	@Override
	public void fireAlarm(Report report, PdfPTable protectionTable) {
		if(report.getProtectionReport().getFireAlarm().getFireReport().equals("Da")&&
				report.getProtectionReport().getFireAlarm().getFireReportMonitord().equals("Da")&&
				report.getProtectionReport().getFireAlarm().getFireReportProbe().equals("Da")){
				
				protectionTable.addCell(new Phrase("Na lokaciji postoji instalacija za dojavu pozara koja se redovno ispituje.PP centrala je nadgledana od strane cuvarske sluzbe."));
			}else if(report.getProtectionReport().getFireAlarm().getFireReport().equals("Ne")){
				
				protectionTable.addCell(new Phrase("Na lokaciji ne postoji instalacija za dojavu pozara."));
			}else if(report.getProtectionReport().getFireAlarm().getFireReport().equals("Da")&&
					report.getProtectionReport().getFireAlarm().getFireReportMonitord().equals("Ne")&&
					report.getProtectionReport().getFireAlarm().getFireReportProbe().equals("Da")){
					
					protectionTable.addCell(new Phrase("Na lokaciji postoji instalacija za dojavu pozara koja se redovno ispituje.PP centrala nije nadgledana od strane cuvarske sluzbe."));
				
			}else if(report.getProtectionReport().getFireAlarm().getFireReport().equals("Da")&&
					report.getProtectionReport().getFireAlarm().getFireReportMonitord().equals("Da")&&
					report.getProtectionReport().getFireAlarm().getFireReportProbe().equals("Ne")){
					
					protectionTable.addCell(new Phrase("Na lokaciji postoji instalacija za dojavu pozara koja se ne ispituje redovno.PP centrala je nadgledana od strane cuvarske sluzbe."));
				
			}else if(report.getProtectionReport().getFireAlarm().getFireReport().equals("Da")&&
					report.getProtectionReport().getFireAlarm().getFireReportMonitord().equals("Ne")&&
					report.getProtectionReport().getFireAlarm().getFireReportProbe().equals("Ne")){
					
					protectionTable.addCell(new Phrase("Na lokaciji postoji instalacija za dojavu pozara koja se ne ispituje redovno.PP centrala nije nadgledana od strane cuvarske sluzbe."));
				
			}
		}
	

}
