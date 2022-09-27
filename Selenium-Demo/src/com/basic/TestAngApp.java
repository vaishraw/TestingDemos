package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAngApp {

	private static String url="http://localhost:4200";
	public static void main(String[] args) {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp-p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		
//		addProductToShoppingCart(webdriver,"ecomm","Headphones","2");
		
//		addProductToShoppingCart(webdriver,"ecomm","Xpath","10");
		
		addPost(webdriver,"tforms","x@y.com"," ");
		
//		validation(webdriver,"tforms","1234");
		

	}
	private static void validation(WebDriver webdriver, String route, String email ) {
		webdriver.get(url+"/"+route);
		webdriver.findElement(By.name("email")).sendKeys(email);
		webdriver.findElement(By.id("tforms")).click();
//		System.out.println(webdriver.findElement(By.class("emailerror")).getText());
		
		
	}
	private static void addProductToShoppingCart(WebDriver webdriver, String route, String productname, String quantity) {
		webdriver.get(url+"/"+route);
		webdriver.findElement(By.name("productName")).sendKeys(productname);
		webdriver.findElement(By.name("quantity")).sendKeys(quantity);
		webdriver.findElement(By.name("addProduct")).click();
	}
	private static void addProductToShoppingCartXpath(WebDriver webdriver, String route, String productname, String quantity) {
		webdriver.get(url+"/"+route);
		webdriver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys(productname);
		webdriver.findElement(By.cssSelector("input[placeholder='Quantity']")).sendKeys(quantity);
		webdriver.findElement(By.name("addProduct")).click();
	}
	private static void addPost(WebDriver webdriver, String route, String email, String quantity) {
		webdriver.get(url+"/"+route);
		webdriver.findElement(By.xpath("//form/div[2]/div/input")).sendKeys(email);
//		webdriver.findElement(By.cssSelector("input[placeholder='Quantity']")).sendKeys(quantity);
//		webdriver.findElement(By.name("addProduct")).click();
	}
	

}
