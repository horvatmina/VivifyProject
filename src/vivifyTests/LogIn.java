package vivifyTests;

import org.testng.annotations.Test;

public class LogIn extends BaseTest {

	@Test(priority = 0)
	public void logInValidCredentials() {
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
	}

}
