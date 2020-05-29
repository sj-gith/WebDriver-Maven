package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	 WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sajes\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		//System.out.println("chrome launched");
	}

	@Test
	public void doLogin() throws InterruptedException {

		driver.get("http:\\gmail.com");
		System.out.println("chrome launched");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("sajessu@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		System.out.println("clicked on next button");

	}

	@AfterSuite
	public void tearDown() {

		driver.close();
		
		System.out.println("browser is closed");
	}

}
