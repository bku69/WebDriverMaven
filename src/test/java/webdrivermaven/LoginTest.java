package webdrivermaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void beforeTest() {
		

		System.setProperty("webdriver.chrome.driver","D:\\courses\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void doLogin() throws InterruptedException {

		driver.get("https://xing.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".login-button.login-text")).click();
		driver.findElement(By.name("login_form[username]")).sendKeys("BlaBlaBlaBla");
		driver.findElement(By.name("login_form[password]")).sendKeys("BlaBlaBlaBla");

	}

	@AfterSuite
	public void afterSuite() {
			driver.quit();
	}
}
