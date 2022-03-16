import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/select-menu");
		obj.manage().window().maximize();
		WebElement Selectelement=obj.findElement(By.id("oldSelectMenu"));
		 
		Select obj1=new Select(Selectelement);
		obj1.selectByIndex(2);
		obj1.selectByVisibleText("purple");
		obj1.selectByValue("7");

		List<WebElement> options=obj1.getOptions();
		Iterator <WebElement> test=options.iterator();
		while(test.hasNext()) {
			System.out.println(test.next().getText());
		}
		

	}

}
