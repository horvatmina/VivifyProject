package vivifyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePage {
	WebDriver driver;
	WebElement titleField;
	WebElement descriptionsField;
	WebElement imagesField;
	WebElement submitButton;
	WebElement myGalleriesButton;

    //constructor
	public CreatePage(WebDriver driver) {
		this.driver = driver;
	}

	//getters
	public WebElement getTitleField() {
		return driver.findElement(By.id("title"));
	}

	public WebElement getDescriptionsField() {
		return driver.findElement(By.id("description"));
	}

	public WebElement getImagesField() {
		return driver.findElement(By.xpath("//input[@placeholder='image url']"));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public WebElement getMyGalleriesButton() {
		return driver.findElement(By.xpath("//*[contains(@href,'my-galleries')]"));
	}

	//methods
	public void titleField (String title) {
		this.getTitleField().clear();
		this.getTitleField().sendKeys(title);
	}
	
	public void descriptionsField (String description) {
		this.getDescriptionsField().clear();
		this.getDescriptionsField().sendKeys(description);
	}
	
	public void addImage () {
		this.getImagesField().sendKeys("http://zivotinje.info/wp-content/uploads/2019/11/Najbolji-psi-za-stan-i-kucu-%E2%80%93-top-15.jpg");
		this.getSubmitButton().click();
	}
	
	public void clickMyGalleriesButton () {
		this.getMyGalleriesButton().click();
	}
	

}
