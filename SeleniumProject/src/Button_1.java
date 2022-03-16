import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/buttons");
		obj.manage().window().maximize();
		
	WebElement jar=	obj.findElement(By.id("doubleClickBtn"));
	jar.click();
	System.out.println("masseage display is " + jar.getText());
	
	

	}

}
