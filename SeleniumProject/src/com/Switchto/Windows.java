package com.Switchto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe" );
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/webtables");
		
		List<WebElement> rowelement=obj.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div"));
		
		System.out.println(rowelement.size());
		
		int rowsize=rowelement.size();
		
List<WebElement> columnelement=obj.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div"));
		
		System.out.println(columnelement.size());
		int colsize=rowelement.size();
		
		
				System.out.println(obj.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]")).getText());
			}//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div
		

		

	}


