import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.debugger.Debugger.EvaluateOnCallFrameResponse;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.londonfreelance.org/courses/frames/index.html");
		obj.manage().window().maximize();
		obj.switchTo().frame("content");
	    WebElement driver=	obj.findElement(By.tagName("h1"));
		System.out.println(driver.getText());
		
		
		}

}
