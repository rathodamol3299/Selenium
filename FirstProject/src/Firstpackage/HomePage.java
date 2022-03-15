package Firstpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePage {
	
	@BeforeMethod
	public void Precondition() {
		System.out.println("Home Page Before method");
		
	}
	
	@Test
	public void TC1() throws Exception {
		System.out.println("I am home page test case");
		throw new Exception();
		
	}
	
	@Test
	public void TC2() throws Exception {
		System.out.println("I am home page test case");
		
		
	}
	
	@AfterMethod
	public void AfterCondtion() {
		System.out.println("Home Page After method");
	}

}
