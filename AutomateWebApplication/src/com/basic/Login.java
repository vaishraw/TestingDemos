package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp-p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.saucedemo.com");
		webdriver.findElement(By.name("user-name")).sendKeys("standard_user");
		webdriver.findElement(By.name("password")).sendKeys("secret_sauce");
		webdriver.findElement(By.id("login-button")).click();
	}

}
