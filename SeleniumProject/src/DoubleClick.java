import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/buttons");
		obj.manage().window().maximize();
//		WebElement rightclcik=obj.findElement(By.xpath("rightClickBtn"));
		Actions action=new Actions(obj);
		Thread.sleep(2000);
		WebElement rightclcik=obj.findElement(By.cssSelector(".btn-primar"));
		Thread.sleep(2000);
        action.contextClick(rightclcik).build().perform();

	}

}
