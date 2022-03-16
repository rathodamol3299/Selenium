import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "Resources\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		obj.manage().window().maximize();
	
		Actions action=new Actions(obj);
		Thread.sleep(2000);
		WebElement admin=obj.findElement(By.xpath("//input[@id='txtUsername']"));
		admin.sendKeys("Admin");
		WebElement pass=obj.findElement(By.xpath("//input[@id='txtPassword']"));
		pass.sendKeys("admin123");
		Thread.sleep(2000);

		obj.findElement(By.xpath("//input[@type='submit']")).click();
//		login
		
		obj.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) obj;
		 js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);

		obj.findElement(By.xpath("//input[@id='btnSave']")).click();
		WebElement name= obj.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
		name.clear();
	WebElement middle=	obj.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']"));
	middle.clear();
		
		WebElement college=obj.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
		college.clear();
		 
		 obj.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).sendKeys("Amol");
		 Thread.sleep(2000);
		 obj.findElement(By.xpath("//*[@id=\"personal_txtEmpMiddleName\"]")).sendKeys("Rambhau");
		 Thread.sleep(2000);
		 obj.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).sendKeys("Rathod");
		 Thread.sleep(2000);
		 Thread.sleep(40000);

		 obj.findElement(By.xpath("//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[2]/li[4]/img")).click();
		 Thread.sleep(2000);
		 Thread.sleep(2000);

		 obj.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		 
//		 obj.findElement(By.xpath("//*[@id=\"empPic\"]")).click();
//		 WebElement chooseFile = obj.findElement(By.xpath("//*[@id=\"photofile\"]"));
//		 
		 Thread.sleep(2000);
//		 chooseFile.sendKeys("C:\\Users\\Amol Rathod\\IdeaProjects\\amol\\image.jpg");
//		 Thread.sleep(2000);
//		 obj.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
//		
	WebElement Admin=obj.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
	Thread.sleep(2000);

		WebElement userman=obj.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		Thread.sleep(2000);
		WebElement user=obj.findElement(By.xpath("//*[@id=\'menu_admin_viewSystemUsers\']"));
		Thread.sleep(2000);

		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);

		action.moveToElement(userman).build().perform();
		Thread.sleep(2000);

	action.moveToElement(user).click().build().perform();
	}

}
