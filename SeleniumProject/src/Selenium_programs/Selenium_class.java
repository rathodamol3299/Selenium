package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_class {

	public static void main(String[] args) throws InterruptedException  {
//		set property 
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		 ChromeDriver obj=new ChromeDriver();
		
		obj.get("https://demoqa.com/checkbox");
		obj.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement checkbox=obj.findElement(By.xpath("//label[@for='tree-node-home']"));
		if(!checkbox.isSelected()) {
		checkbox.click();
		}
		WebElement result=obj.findElement(By.xpath("//div[@id='result']"));
		if(result.isDisplayed()) {
		System.out.println(result.getText());
		}
		
		

}
}
