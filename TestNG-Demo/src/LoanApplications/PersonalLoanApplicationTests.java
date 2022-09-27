package LoanApplications;

import org.testng.annotations.Test;

public class PersonalLoanApplicationTests {

	@Test(groups= {"Smoke"})
	public void personalloanLoginWeb() {
		System.out.println("Personal Loan Application-Web Login");
	}
	
	@Test
	public void personalloanLoginMobile() {
		System.out.println("Personal Loan Application-Mobile Login");
	}
	
	@Test
	public void personalloanLoginAPI() {
		System.out.println("Personal Loan Application-API Login");
	}
}
