import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows_in_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/browser-windows");
		obj.manage().window().maximize();
		
//		opening all the child windows 
		obj.findElement(By.id("windowButton")).click();
		obj.findElement(By.id("messageWindowButton")).click();
		
		String Mainwindow =obj.getWindowHandle();
		System.out.println("main window handle is "+Mainwindow);
//		 
//		 to handle all new open window 
		Set<String> s1=obj.getWindowHandles();
		System.out.println("child window handle is " +s1);
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext()) {
			String childwindow =i1.next();
			if(!Mainwindow.equalsIgnoreCase(childwindow)) {
				obj.switchTo().window(childwindow);
				obj.close();
				System.out.println("child window cloased ");
			}
		}
		
		

	}

}
