package LoanApplications;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoanApplicationTests {

	@Parameters({"URL"})
//	@Test(groups= {"Smoke"})
	@Test
	public void personalloanLoginWeb(String url) {
		System.out.println("Personal Loan Application-Web Login");
		System.out.println("Weg login url= " + url);
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
