import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

	}
	

	@Test
	public void doLogin() throws InterruptedException {
		
		driver.get("http://gmail.com");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("lougani2010@gmail.com");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("bouchra83");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		//Click on sign in
		driver.findElement(By.cssSelector("[id='signin']")).click();

	}
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
