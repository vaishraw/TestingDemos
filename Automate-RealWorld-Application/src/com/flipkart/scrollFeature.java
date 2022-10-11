package com.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class scrollFeature {
	WebDriver webdriver = null;
	String URL = "http://www.flipkart.com/";

	@Test
	public void scrollFeature() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\hp-p\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		webdriver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp-p\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		webdriver = new EdgeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		webdriver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

//		Actions act = new Actions(webdriver);

		webdriver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();

		
		webdriver.findElement(By.xpath("(//img[@alt='Moto Edge 30'])[2]")).click();
		webdriver.findElement(By.xpath("//div[@class='_2LR_KO']")).click();
		webdriver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("SAMSUNG");
		webdriver.findElement(By.xpath("//div[@title='SAMSUNG']//div[@class='_24_Dny']")).click();

//	   To Verify page has a scroll feature 

		WebElement Element = webdriver.findElement(By.xpath(
				"//div[normalize-space()='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']"));
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		System.out.println("Scroll Feature Verified Successfully");
	}
}
