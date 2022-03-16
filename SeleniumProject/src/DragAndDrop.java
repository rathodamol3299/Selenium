import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/droppable/");
		Actions action=new Actions(obj);
		obj.manage().window().maximize();
		
//	WebElement source=	obj.findElement(By.xpath("//*[@id=\"draggable\"]"));
//	
//	WebElement targate=obj.findElement(By.xpath("//*[@id=\"droppable\"]"));
//	
//	Actions action=new Actions(obj);
//	Thread.sleep(2000);
//	action.clickAndHold(source).moveToElement(targate).release().build().perform();
//	Thread.sleep(2000);

//	WebElement after=obj.findElement(By.xpath("//*[@id=\"droppableExample-tab-accept\"]"));
//	after.click();
//	
//	Thread.sleep(2000);
//
//	WebElement drag=obj.findElement(By.xpath("//*[@id=\"acceptable\"]"));
//	WebElement drag1=obj.findElement(By.xpath("//*[@id=\"notAcceptable\"]"));
//	WebElement drop=obj.findElement(By.xpath("//*[@id=\"droppable\"]"));
//	Thread.sleep(2000)	;
//	action.clickAndHold().moveToElement(drop).build().perform();
		 obj.findElement(By.xpath("//a[text()='Accept']")).click();
		 Thread.sleep(2000);
         WebElement D=obj.findElement(By.id("acceptable"));
         WebElement D1=obj.findElement(By.xpath("//*[@id=\"notAcceptable\"]"));
         Thread.sleep(2000);
         WebElement Target1=obj.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
                 action.clickAndHold(D).moveToElement(Target1).release().build().perform();
                 Thread.sleep(2000);
                 action.clickAndHold(D1).moveToElement(Target1).release().build().perform();
                        Thread.sleep(1000);
                  
             WebElement pro=obj.findElement(By.xpath("//*[@id=\"droppableExample-tab-preventPropogation\"]"));
             pro.click();
             Thread.sleep(2000);
             WebElement Dropme=obj.findElement(By.xpath("//*[@id=\"dragBox\"]"));
             WebElement innerdrop=obj.findElement(By.xpath("//*[@id=\"notGreedyInnerDropBox\"]"));
             action.dragAndDrop(Dropme, innerdrop).build().perform();
             Thread.sleep(2000);
             
             obj.findElement(By.xpath("//*[@id=\"droppableExample-tab-revertable\"]")).click();
             
             WebElement front=obj.findElement(By.xpath("//*[@id=\"notRevertable\"]"));
             Thread.sleep(2000);
             WebElement back=obj.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='revertable']"));
             
             action.dragAndDrop(front, back).build().perform();
             

	

		
		
	}

}
