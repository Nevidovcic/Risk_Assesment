import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.nevii.model.FireAlarm;
import com.nevii.model.FireExtinguisher;
import com.nevii.model.FireFightingIns;
import com.nevii.model.Hydrant;
import com.nevii.model.LightningConductor;
import com.nevii.model.Protection;
import com.nevii.service.impl.FireProtectionServiceImpl;

public class RickProtectionServiceTest {
	
	FireProtectionServiceImpl service;
	
	Protection protection;
	FireExtinguisher exting;
	Hydrant hydrant;
	LightningConductor light;
	FireFightingIns fireFight;
	FireAlarm alarm;
	
	@Before
	public void setup(){
		
		hydrant=new Hydrant();
		
		hydrant.setHydrants("Ne");
		/*hydrant.setHydrantsCabAffordable("Ne");
		hydrant.setHydrantsCabEqquiped("Ne");
		hydrant.setHydrantsPressure("Da");*/
		
		exting= new FireExtinguisher();
		
		exting.setFireExting("Ne");
		/*exting.setFireExtingNumb("Da");
		exting.setFireExtingProbe("Da");*/
		
		light=new LightningConductor();
		
		light.setLightningRod("Ne");
		
		fireFight=new FireFightingIns();
		fireFight.setFireFigtingInstal("Ne");
		
		alarm=new FireAlarm();
		alarm.setFireReport("Ne");
		
		protection=new Protection();
		
		protection.setHydrant(hydrant);
		protection.setFireExtinguisher(exting);
		protection.setFireAlarm(alarm);
		protection.setLightningConductor(light);
		protection.setFireFightingIns(fireFight);
		protection.setFenced("Ne");
		protection.setFireBrigade("Ne");
		protection.setFireProtectionMan("Ne");
		protection.setIlluminated("Ne");
		protection.setSecurity("Ne");
		protection.setTheftSystem("Ne");
		protection.setVideoSurve("Ne");
	
		
		service=new FireProtectionServiceImpl();
		
	}
	@Ignore
	@Test
	public void calcHydrant() {
		assertEquals("0.25",service.calcFinalResult(protection).toString());
		
		
	}
	@Ignore
	@Test
	public void calcFireExting(){
		assertEquals("0.0", service.calcHydrant(protection).toString());
		
	}
	@Ignore
	@Test
	public void markTest(){
		
		service.mark(protection, service);
		
		assertEquals("LOS",protection.getMark());
		System.out.println(protection.getMark());
		
	}
	
	

}
