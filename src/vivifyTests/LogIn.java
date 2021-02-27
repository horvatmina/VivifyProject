package vivifyTests;

import org.testng.annotations.Test;

public class LogIn extends BaseTest {
	
	@Test (priority = 0)
	public void logInValidCredentials () {
		homePage.clickLoginButton();
		loginPage.logIn("pera@fakemail.com", "pera1234");
	}

}
