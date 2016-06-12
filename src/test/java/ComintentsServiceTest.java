import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

import com.nevii.model.Comintents;
import com.nevii.servicejpa.impl.ComintentsServiceJpaImpl;

public class ComintentsServiceTest {
	
	ComintentsServiceJpaImpl service;
	Comintents cominte;
			
	@Before
	public void start(){
		
		cominte=new Comintents();
		
		cominte.setActivityOfCompany("POstovanje");
		cominte.setPassword(1l);
		cominte.setMb(12311312);
		cominte.setPib(121311);
		cominte.setName("Pera");
		
		service=new ComintentsServiceJpaImpl();
	}
	@Ignore
	@Test
	public void test(){
		
		assertNotNull(service.findByPass(1L));
	}

}
