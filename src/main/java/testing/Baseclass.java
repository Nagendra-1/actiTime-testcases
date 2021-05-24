package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	static WebDriver driver;
		@BeforeTest
			public  void openBrowser()
			{
				String browser="chrome";
				String url="http://desktop-blkcn54/login.do";
				 if(browser.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\selenium software\\chromedriver.exe");
					driver=new FirefoxDriver();
					
				}
				 else if (browser.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\selenium software\\chromedriver.exe");
					driver=new ChromeDriver();
				}

				driver.get(url);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			}
		@BeforeClass
			public void login(){
				String username="admin";
				String pwd="manager";
				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(pwd);
				driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			}	
			@AfterClass
			public void logout()
			{
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			}}