package vivifyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest {
	
	@Test 
	public void logInValidCredentials () {
		homePage.clickLoginButton();
		loginPage.logIn("peraaa@fakemail.com", "pera1234");
		Assert.assertTrue(homePage.getLogoutButton().isDisplayed());
	}
}
