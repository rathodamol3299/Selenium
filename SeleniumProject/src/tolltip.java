import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tolltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/tool-tips/");
		obj.manage().window().maximize();
		Actions action =new  Actions(obj);
		action.clickAndHold(obj.findElement(By.id("toolTipButton"))).perform();
		System.out.println(obj.findElement(By.className("tooltip-Inner")).getText());
	}

}
