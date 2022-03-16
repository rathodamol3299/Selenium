import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandleinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/browser-windows");
		obj.manage().window().maximize();
		
//		open new child window within the main window 
		
		obj.findElement(By.id("windowButton")).click();
		
//		get handles of windows 
		
		String MainWindowHandle=obj.getWindowHandle();
		Set<String> allWindowHandles=obj.getWindowHandles();
		Iterator<String> obj1=allWindowHandles.iterator();
		
		while(obj1.hasNext()) {
			String childwindow=obj1.next();
			if(!MainWindowHandle.equalsIgnoreCase(childwindow)) {
				obj.switchTo().window(childwindow);
				WebElement text=obj.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
				System.out.println("Heading of child window is "+text.getText());
			
				
			}
			
		}
		
		
		

	}

}
