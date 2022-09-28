package LoanApplications;

import org.testng.annotations.Test;

public class CarLoanApplicationTests {

	@Test(timeOut = 4000)
	public void carloanLoginWeb() {
		System.out.println("Car Loan Application-Web Login");
	}
	
//	@Test(groups= {"Smoke"})
	@Test(enabled=false)
	public void carloanLoginMobile() {
		System.out.println("Car Loan Application-Mobile Login");
	}
	
	@Test (dependsOnMethods = { "carloanLoginWeb"})
	public void carloanLoginAPI() {
		System.out.println("Car Loan Application-API Login");
	}
	
}
