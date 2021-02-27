package vivifyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyGalleryPage {
	WebDriver driver;
	WebElement firstGallery;
	
    //constructor
	public MyGalleryPage(WebDriver driver) {
		this.driver = driver;
	}

	//getters
	public WebElement getFirstGallery() {
		return driver.findElement(By.xpath("//*[contains(text(),'Psi')]"));
	}

}
