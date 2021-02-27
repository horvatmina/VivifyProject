package vivifyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement loginButton;
    
	//constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//getters
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//*[contains(@href,'login')]"));	
	}
	
	public void clickLoginButton () {
		this.getLoginButton().click();
	}

}
