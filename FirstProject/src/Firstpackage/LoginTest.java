package Firstpackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
		
	//sanity,smoke and regression 
	
	@Test(description="Verify that user is able to login with valid credential",priority=2,invocationCount=1,groups= {"smoke","sanity","regression"})
	public void TC1() {
		System.out.println("I am entering valid username ");
		System.out.println("I am entering valid password ");
		System.out.println("Click on login button");
		System.out.println("Verify the Dashboard label");
		//Expected - User should be able to login and navigate to dashboard page
		SoftAssert obj=new SoftAssert();//soft Assert
		obj.assertEquals("MyInfo", "Dashboard");//Hard Assert -if it is fail then don't run remaining part 
		System.out.println("I am after assert fail");
	}
	
	
	@Test(description="Verify that system should not allow to login with invalid credential",priority=1,groups= {"sanity"})
	public void TC2() {
		System.out.println("I am entering invalid username ");
		System.out.println("I am entering valid password ");
		System.out.println("Click on login button");
		System.out.println("Verify the error label");
		Assert.assertEquals("Invalid credential", "Invalid credential");
		System.out.println("I am after assert pass");
	}
	
	//sanity test cases -2
	//regression --2
	//smoke --1
	@Test(enabled=true,description="Verify the forgot password functionality ",groups= {"regression"},dependsOnMethods="TC2")
	public void TC3() {
		System.out.println("I am third test case");
		Reporter.log("I am login information from TC3");
	}
	
	
	
	
	

}
