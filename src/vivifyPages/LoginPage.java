package vivifyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	WebElement emailField;
	WebElement passwordField;
	WebElement submitButton;
	WebElement pleaseLogin;
	
    //constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//getters
	public WebElement getEmailField() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public WebElement getPleaseLogin() {
		return driver.findElement(By.className("title-style"));
	}

	//methods
	public void logIn (String email, String password) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(email);
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
		this.getSubmitButton().click();
	}
}
