package com.Switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		 ChromeDriver obj=new ChromeDriver();
		
		obj.get("https://demoqa.com/alerts");
		obj.manage().window().maximize();
		Thread.sleep(2000);
//		WebElement clickbutton=obj.findElement(By.xpath("//*[@id=\"alertButton\"]"));
//		clickbutton.click();
//		Thread.sleep(2000);
//		Alert obj1=obj.switchTo().alert();
//		obj1.accept();
//		Thread.sleep(2000);
//		WebElement clickElement=obj.findElement(By.xpath("//button[@id='confirmButton']"));
//		clickElement.click();
//		Thread.sleep(2000);
//		Alert obj1=obj.switchTo().alert();
//		obj1.accept();
		WebElement clickElement2=obj.findElement(By.xpath("//button[@id='promtButton']"));
		clickElement2.click();
		Thread.sleep(2000);
		clickElement2.sendKeys(" I am superman ");
		Thread.sleep(2000);
//		Alert obj2=obj.switchTo().alert();
//		obj2.accept();

		
		
//		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver");
//				//When you create object then automatically browser will lauch
//				ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
//				//Enter the URL which you want to enter in the browser
//				driver.get("https://demoqa.com/alerts");
//				WebElement clickbutton=driver.findElement(By.xpath("//button[@id='promtButton']"));
//				clickbutton.click();
//				//We have to click on OK button of pop up window
//				//step 1 --w
//		qhx-afhs-bes
//	}

}}
