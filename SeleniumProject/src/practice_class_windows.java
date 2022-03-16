import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_class_windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/radio-button");
		obj.manage().window().maximize();
		Thread.sleep(2000);
		
		
////	check box //input [@id='tree-node-home']
//		WebElement checkbox=obj.findElement(By.xpath("//label[@for='tree-node-home']"));
//		
//		boolean isSelected = checkbox.isSelected();
//		
//		//performing click operation if element is not checked
//		if(isSelected ==false) {
//			checkbox.click();
////		}
		WebElement radio=obj.findElement(By.xpath("//label[text()='Yes']"));
		radio.click();
		
		System.out.println(radio.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		

	}

}
