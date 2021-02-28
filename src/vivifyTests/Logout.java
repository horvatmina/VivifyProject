package vivifyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends BaseTest{
	
	@Test 
	public void logout () {
		logInValidCredentials ();
		homePage.clickLogoutButton();
		
		String actualText = loginPage.getPleaseLogin().getText();
		Assert.assertEquals(actualText, "PLEASE LOGIN");
			
	}
}

	
