import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/browser-windows");
		obj.manage().window().maximize();
//		open new window by clicking on button
		obj.findElement(By.id("windowButton")).click();
	
//		Clicking on the new window element and read the text displayed on the window
		
		WebElement text=obj.findElement(By.id("sampleHeading"));
		
//		fetching the text using method and printing it
		System.out.println(text.getText());
		Thread.sleep(2000);
		obj.quit();
		
		
		

	}

}
