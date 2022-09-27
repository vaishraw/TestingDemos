package LoanApplications;

import org.testng.annotations.Test;

public class CarLoanApplicationTests {

	@Test
	public void carloanLoginWeb() {
		System.out.println("Car Loan Application-Web Login");
	}
	
	@Test(groups= {"Smoke"})
	public void carloanLoginMobile() {
		System.out.println("Car Loan Application-Mobile Login");
	}
	
	@Test
	public void carloanLoginAPI() {
		System.out.println("Car Loan Application-API Login");
	}
	
}
