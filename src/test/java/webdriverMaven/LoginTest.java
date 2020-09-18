package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	 WebDriver driver;

	@BeforeSuite
	public void setUp() {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("chrome launched");
	}

	@Test
	public void doLogin() throws InterruptedException {

		driver.get("http:\\gmail.com");
		System.out.println("chrome launched");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("sajessu@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		System.out.println("clicked on next button");
		driver.close();

	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
		
		System.out.println("browser is closed");
	}

}
