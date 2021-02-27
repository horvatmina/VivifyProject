package vivifyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement loginButton;
	WebElement createGalleryButton;
	WebElement logoutButton;
	WebElement firstGallery;
	WebElement searchField;
	WebElement filterButton;
    
	//constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//getters
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//*[contains(@href,'login')]"));	
	}
	
	public WebElement getCreateGalleryButton() {
		return driver.findElement(By.xpath("//*[contains(@href,'create')]"));
	}

	public WebElement getLogoutButton() {
		return driver.findElement(By.xpath("//a[@role='button ']"));
	}
	
	public WebElement getFirstGallery() {
		return driver.findElement(By.xpath("//*[contains(text(),'Psi')]"));
	}
	
	public WebElement getSearchField() {
		return driver.findElement(By.xpath("//input[@placeholder='Search...']"));
	}

	public WebElement getFilterButton() {
		return driver.findElement(By.xpath("//button[@type='button']"));
	}

	//methods
	public void clickLoginButton () {
		this.getLoginButton().click();
	}
	
	public void clickCreateGalleryButton () {
		this.getCreateGalleryButton().click();
	}
	
	public void inputMyGalleryName (String name) {
		this.getSearchField().sendKeys(name);
		this.getFilterButton().click();
	}
	
	public void clickLogoutButton () {
		this.getLogoutButton().click();
	}

}
