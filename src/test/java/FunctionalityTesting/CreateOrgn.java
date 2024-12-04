package FunctionalityTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Com.Crm.BaseClass.BaseClass;
import Com.Crm.Pom.CreateOrganization;
@Listeners(Com.Crm.Listeners.Listeners.class)
public class CreateOrgn extends BaseClass{

	@Test
	public void organization() throws InterruptedException
	{
		CreateOrganization co=new CreateOrganization(driver);
		
		co.getOrganization().click();
	}
}
