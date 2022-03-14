package com.test.testngclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("I am test case ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after method ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am before class ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am after class ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am before test ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am after test ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am before suite ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am after suite ");
  }

}
