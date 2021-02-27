package vivifyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMyGallery extends BaseTest {
	
	@Test
	public void findMyGallery () {
		logInValidCredentials ();
		homePage.inputMyGalleryName("psi");
		
		String actualText = homePage.getFirstGallery().getText();
		Assert.assertEquals(actualText, "Psi");
	}
}
