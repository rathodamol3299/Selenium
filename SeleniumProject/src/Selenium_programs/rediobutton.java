package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		 ChromeDriver obj=new ChromeDriver();
		
		obj.get("https://demoqa.com/radio-button");
		obj.manage().window().maximize();
		
		WebElement redioButton=obj.findElement(By.xpath("//label[@for='yesRadio']"));
		redioButton.click();
		Thread.sleep(2000);
		
		WebElement impressive=obj.findElement(By.xpath("//label[@for='impressiveRadio']"));
		impressive.click();

	}

}
