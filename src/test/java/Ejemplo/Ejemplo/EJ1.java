package Ejemplo.Ejemplo;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


public class EJ1 {

	
	WebDriver driver;
	String url ="https://demo.guru99.com/test/delete_customer.php";
	String ChromeDrivePath = "..\\Repo\\Drivers\\chromedriver.exe";

	

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ChromeDrivePath);
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--no-sandbox");
	    driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		//readFile = new ReadExcelFile();
		driver.get(url);
		
	}
	
	@Test
	public void alertaAcept() {
		driver.findElement(By.name("cusid")).sendKeys("Costumer3");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//WebDriverWait myWait = new WebDriverWait(driver,10);
		//myWait.until(ExpectedConditions.alertIsPresent());
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.alert = function() {};"); 
		System.out.println(alert.getText());
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		  driver.close();	
	
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	   
	  }
	
}
