package com.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public static void main(String[] args) {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp-p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();

		webdriver.get("http://automationpractice.com/index.php");
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		webdriver.findElement(By.name("email_create")).sendKeys("mary02@gmail.com");
		webdriver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();

		webdriver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Mary");
		webdriver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Anne");
		webdriver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Mary123@");

		webdriver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Mary");
		webdriver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Anne");

		webdriver.findElement(By.xpath("//*[@id='address1']")).sendKeys("C-14,Main Street");

		webdriver.findElement(By.xpath("//*[@id='city']")).sendKeys("Carolina");

		Select sState = new Select(webdriver.findElement(By.xpath("//*[@id='id_state']")));
		sState.selectByVisibleText("Puerto Rico");

		webdriver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("66666");

		Select sCountry = new Select(webdriver.findElement(By.xpath("//*[@id='id_country']")));
		sCountry.selectByVisibleText("United States");

		webdriver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("123456789");
		webdriver.findElement(By.xpath("//*[@id='alias']")).sendKeys("Home");
		webdriver.findElement(By.xpath("//*[@id='submitAccount']")).click();
	}

}
