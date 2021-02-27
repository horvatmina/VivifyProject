package vivifyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateGallery extends BaseTest{
	
	@Test 
	public void createGallery () {
		logInValidCredentials ();
		homePage.clickCreateGalleryButton();
		createPage.titleField("Psi");
		createPage.descriptionsField("Labrador");
		createPage.addImage();
		
		String actualText = homePage.getFirstGallery().getText();
		Assert.assertEquals(actualText, "Psi");
	}

}
