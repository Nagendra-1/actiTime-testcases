package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practicetesting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium software\\chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("http://desktop-blkcn54/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
	 c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//a[@id='loginButton']")).click();
		
			                  	//ITS A NEW WEBPAGE TASKS
				c.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]/img[1]")).click();
				WebElement createnewtask=c.findElement(By.xpath("//input[@value='Create New Tasks']"));
				createnewtask.click();
			c.findElement(By.name("customerId")).click();
	//	c.findElement(By.name("customerId")).click();
	
        c.findElement(By.xpath("//option[contains(text(),'-- new customer --')]")).click();
	
		c.findElement(By.xpath("//tbody/tr[@id='new_customer']/td[4]/input[1]")).sendKeys("nagendra wa");
c.findElement(By.xpath("//tbody/tr[@id='new_project']/td[4]/input[1]")).sendKeys("application testing");
c.findElement(By.xpath("//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).sendKeys("test case1 is already testing");;
c.findElement(By.xpath("//input[@id='taskDeadline0']")).sendKeys("may 14,2021");
WebElement billElement=c.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/select[1]"));
Select s2=new Select(billElement);
s2.selectByVisibleText("Billable");
WebElement checkbox=c.findElement(By.xpath("//tbody/tr[2]/td[4]/input[1]"));
checkbox.click();
c.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")).sendKeys("test case2 is ongoing process");
c.findElement(By.xpath("//input[@id='taskDeadline1']")).sendKeys("may 15,2021");
WebElement bill=checkbox.findElement(By.xpath("//tbody/tr[3]/td[3]/div[1]/select[1]"));
Select s3=new Select(bill);
s3.selectByVisibleText("Non-Billable");
WebElement checkbox1=c.findElement(By.xpath("//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[3]/td[4]/input[1]"));
checkbox1.click();

c.findElement(By.xpath("//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();

                             //USERS ITS A NEW WEBPAGE
c.findElement(By.xpath("//tbody/tr[1]/td[9]/a[1]/img[1]")).click();
c.findElement(By.xpath("//input[@value='Create New User']")).click();
c.findElement(By.xpath("//input[@name='username']")).sendKeys("Nagendew");
c.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("nagendra@1");
c.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("nagendra@1");
WebElement click=c.findElement(By.name("active"));
Select s4=new Select(click);
s4.selectByVisibleText("enabled");
c.findElement(By.xpath("//input[@name='firstName']")).sendKeys("nagal");
c.findElement(By.xpath("//input[@name='lastName']")).sendKeys("babuu");
c.findElement(By.xpath("//input[@name='middleName']")).sendKeys("reddy");
c.findElement(By.xpath("//input[@name='phone']")).sendKeys("9989799009");

c.findElement(By.xpath("//input[@id='overtimeTracking_Enable']")).click();
c.findElement(By.xpath("//input[@value='   Create User   ']")).click();
                            // IN TASKS PROJECTS AND CUSTOMERS

c.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]/img[1]")).click();
c.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]")).click();
                         // CREATE NEW CUSTOMER
c.findElement(By.xpath("//input[@value='Create New Customer']")).click();
c.findElement(By.xpath("//input[@name='name']")).sendKeys("testing");
c.findElement(By.xpath("//textarea[@name='description']")).sendKeys("application is test the each and everyone");
c.findElement(By.xpath("//input[@id='add_project_action']")).click();
c.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
                           // CREATE NEW PROJECT
c.findElement(By.xpath("//input[@name='name']")).sendKeys("testing prohect");
c.findElement(By.xpath("//textarea[@name='description']")).sendKeys("this project is going to be tested by tester testing is successfully completed");
c.findElement(By.xpath("//input[@id='add_tasks_action']")).click();
c.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();


c.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys("testing completedd");
c.findElement(By.xpath("//input[@id='taskDeadline0']")).sendKeys("may 10,2021");
WebElement ww=c.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/select[1]"));
Select ss=new Select(ww);
ss.selectByVisibleText("Billable");
c.findElement(By.xpath("//tbody/tr[2]/td[4]/input[1]")).click();
c.findElement(By.xpath("//input[@name='task[1].name']")).sendKeys("testing is ongoing");
c.findElement(By.xpath("//input[@id='taskDeadline1']")).sendKeys("june 10,2022");
WebElement e=c.findElement(By.xpath("//tbody/tr[3]/td[3]/div[1]/select[1]"));
Select s9=new Select(e);
s9.selectByVisibleText("Non-Billable");
c.findElement(By.xpath("//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[3]/td[4]/input[1]")).click();
c.findElement(By.xpath("//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();
                                    

                            //LOGOUT
c.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}