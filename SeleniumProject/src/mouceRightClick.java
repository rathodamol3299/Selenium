import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouceRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/buttons");
		
		Actions action=new Actions(obj);
		WebElement rightclick=obj.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(rightclick).build().perform();

	}

}
