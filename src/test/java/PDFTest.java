import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lowagie.text.pdf.PdfPTable;
import com.nevii.model.Protection;
import com.nevii.model.Report;
import com.nevii.pdf.PDFCreation;

import static org.junit.Assert.*;

public class PDFTest {
	
	Report report;
	PdfPTable protectionTable;
	PDFCreation pdf;
	Protection protection;
	
	
	@Before
	public void innit(){
		
		report =new Report();
		
		protection=new Protection();
		protection.setFenced("Da");
		protection.setIlluminated("Da");
		report.setProtectionReport(protection);
		protectionTable = new PdfPTable(2);
		
	}
	@Ignore
	@Test
	public void test(){
		
		pdf.fencedAndIlluminated(report, protectionTable);
		assertEquals("Lokacija je ogradjena i osvetljena.",true);
		assertTrue("Lokacija je ogradjena i osvetljena.",true);
	}
}
