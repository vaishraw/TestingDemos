package LoanApplications;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanApplicationTests {

//	@Test
//	public void homeloanLoginWeb() {
//		System.out.println("Home Loan Application-Web Login");
//	}
//	
//	@Test
//	public void homeloanLoginMobile() {
//		System.out.println("Home Loan Application-Mobile Login");
//	}
//	
//	@Test
//	public void homeloanLoginAPI() {
//		System.out.println("Home Loan Application-API Login");
//	}
	
	@BeforeTest
	public void setupTestData() {
		System.out.println("Setting up Test Data");
	}
	
	@AfterTest
	public void cleanupTestData() {
		System.out.println("Cleaning up Test Data");
	}
	
	@Test
	public void WebHomeLoan() {
		System.out.println("Home loan application - web login test");
	}
	
	@Test
	public void MobileHomeLoan() {
		System.out.println("Home loan application - mobile login test");
	}
	
	@Test(groups= {"Smoke"})
	public void APIHomeLoan() {
		System.out.println("Home loan application - API login test");
	}
	
	@BeforeMethod
	public void dosomething() {
		System.out.println("Hello");
	}
	
	@BeforeSuite
	public void startDatabase() {
		System.out.println("Starting db server");
	}
}
