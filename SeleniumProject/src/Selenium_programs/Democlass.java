package Selenium_programs;

import javax.swing.text.html.FormSubmitEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Democlass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		 ChromeDriver obj=new ChromeDriver();
		
		obj.get("https://demoqa.com/checkbox");
		obj.manage().window().maximize();
//		obj.manage().window().minimize();
		WebElement FullName=obj.findElement(By.xpath("//*[@id=\"userName\"]"));
		FullName.sendKeys("Testing");
	     WebElement Email=	obj.findElement(By.cssSelector("#userEmail"));
	     Email.sendKeys("rathodamol3299@gmail.com");
	     FullName.sendKeys("AmolRathod");
	     WebElement address=obj.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		 address.sendKeys("Changle Nagar Ambad ");
		 WebElement parmanent=obj.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		 parmanent.sendKeys("Same as Per Current Address ");
	     System.out.println(FullName.getTagName());
	     WebElement Submit=obj.findElement(By.id("submit"));
	     Submit.click();
	
	   
      
		

	}

}
