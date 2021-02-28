package vivifyTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import vivifyPages.CreatePage;
import vivifyPages.HomePage;
import vivifyPages.LoginPage;
import vivifyPages.MyGalleryPage;

public class BaseTest {
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	CreatePage createPage;
	MyGalleryPage myGalleryPage;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		this.driver = new ChromeDriver();
		this.homePage = new HomePage (driver);
		this.loginPage = new LoginPage (driver);
		this.createPage = new CreatePage (driver);
		this.myGalleryPage = new MyGalleryPage (driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	}
	
	@BeforeMethod
	public void setup() {
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
	}
		
	@AfterMethod
	public void afterMethod() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	@AfterClass
	public void tearDown() throws IOException {
		driver.close();
		driver.quit();
	}
	
	public void logInValidCredentials () {
		homePage.clickLoginButton();
		loginPage.logIn("peraaa@fakemail.com", "pera1234");
	}
}
