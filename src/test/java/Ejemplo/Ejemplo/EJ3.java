package Ejemplo.Ejemplo;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


public class EJ3 {
	
	WebDriver driver;
	String url ="https://demo.guru99.com/test/drag_drop.html";
	String ChromeDrivePath = "..\\ProyectoTeoricoPractico\\Drivers\\chromedriver.exe";

	
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ChromeDrivePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//readFile = new ReadExcelFile();
		driver.get(url);
}
	
	@Test
	public void soltarYArrastrar() {
		//Element which needs to drag.    		
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
     
    	//Element on which need to drop.		
    	WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
     		
    	//Using Action class for drag and drop.		
    	Actions act=new Actions(driver);					

    	//Dragged and dropped.		
    	act.dragAndDrop(From, To).build().perform();		
		}	

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	   
	  }
	
	
}
