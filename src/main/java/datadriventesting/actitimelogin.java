package datadriventesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class actitimelogin {
	WebDriver driver;
	@Test(dataProvider = "actiTime")
	public void actitimelogin(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium software\\chromedriver.exe");
	ChromeDriver c=new ChromeDriver();
	c.get("http://desktop-blkcn54/login.do");
	c.findElement(By.name("nagendra")).sendKeys(username);
 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	c.findElement(By.name("pwd")).sendKeys(password);
	c.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(5000);
System.out.println(driver.getTitle());
//c.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name="actiTime")
	public  Object[][] actiTime()
	{
		Object[][] s=new Object[3][2];
		s[0][0] ="admin";
		s[0][1]="manager";
		s[1][0]="admin";
		s[1][1]="manager";
		s[2][0]="admin";
		s[2][1]="manager";
		return s;
		
		
	}

}
