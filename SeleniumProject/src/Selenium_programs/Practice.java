package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		
		ChromeDriver test=new ChromeDriver();
		
		test.get("https://flipKart.com/");
		
		Thread.sleep(2000);
		
		test.manage().window().maximize();
		
		test.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("rathodamol3299@gmail.com");
		Thread.sleep(2000);
	    test.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Amol@123");
		
		Thread.sleep(2000);
		
		test.findElement(By.xpath(" //button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
//		Thread.sleep(2000);
//	WebElement search=test.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
//	search.sendKeys("clothing for men");
//	test.findElement(By.xpath("//input[@value='clothing for men shirt pant']")).click();
////	search.click();
//	
		
		
		

	}

}
