package testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class projectsandcutomerspage { 
	
			@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]/img[1]")
			private WebElement clickprojectsElement;
			public projectsandcutomerspage()
			{
				PageFactory.initElements(Baseclass.driver,this);
			}
			public void projectsclick()
			{
			clickprojectsElement.click();
			}
			@FindBy(xpath = "//a[contains(text(),'Projects & Customers')]")
			private WebElement clickproejstsandcustomerElement;
			public void projndcus()
			{
				clickproejstsandcustomerElement.click();
			}
				@FindBy(xpath ="//input[@value='Create New Customer']")
				private WebElement newcustomerElement;
				public void createnewcustomer()
				{
					newcustomerElement.click();
				}
				@FindBy(xpath = "//input[@name='name']")
				private WebElement enternamElement;
				public void customername(String customer)
				{
					enternamElement.sendKeys(customer);
				}
				@FindBy(xpath = "//textarea[@name='description']")
				private WebElement enterdesctiptionElement;
				public void descripton(String desction)
				{
					enterdesctiptionElement.sendKeys(desction);
				}
				@FindBy(xpath = "//input[@id='add_project_action']")
				private WebElement addprojectElement;
				public void addproject()
				{
					addprojectElement.click();
				}
				@FindBy(xpath = "//input[@name='createCustomerSubmit']")
				private WebElement createcustomerElement;
				public void createcustomer()
				{
					createcustomerElement.click();
				}
			@FindBy(xpath = "//input[@name='name']")
			private WebElement namElement;
			public void entername(String name)
			{
				namElement.sendKeys(name);
			}
			@FindBy(xpath ="//textarea[@name='description']")
			private WebElement descriptionElement;
			public void description(String descripton)
			{
				descriptionElement.sendKeys(descripton);
			}
			@FindBy(xpath = "//input[@id='add_tasks_action']")
			private WebElement taskactionElement;
			public void taskaction()
			{
				taskactionElement.click();
			}
			@FindBy(xpath = "//input[@name='createProjectSubmit']")
			private WebElement createprojectElement;
			public void project()
			{
				createprojectElement.click();
			}
			@FindBy(xpath = "//input[@name='task[0].name']")
			private WebElement enternamElement2;
			public void ntername(String name)
			{
				enternamElement2.sendKeys(name);
			}
			@FindBy(xpath = "//input[@id='taskDeadline0']")
			public WebElement datElement;
			public void datendyear(String date)
			{
				datElement.sendKeys(date);
			}
			@FindBy(xpath = "//tbody/tr[2]/td[3]/div[1]/select[1]")
			public WebElement billElement;
			public void billstatus(String bil)
			{
				Select ss=new Select(billElement);
				ss.selectByVisibleText(bil);	
			}
			@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
			public WebElement clickElement;
			public void clickthebutton()
			{
				clickElement.click();
			}  
			@FindBy(xpath = "//input[@name='task[1].name']")
			public WebElement name;
			public void enternam(String sname)
			{
				name.sendKeys(sname);
			}
			@FindBy(xpath = "//input[@id='taskDeadline1']")
			public WebElement taskdeadElement;
			 public void taskdeadline(String dead)
			 {
				 taskdeadElement.sendKeys(dead);
			 }
			 @FindBy (xpath = "//tbody/tr[3]/td[3]/div[1]/select[1]")
			 public WebElement billElement2;
			 public void billname(String line)
			 {Select s9=new Select(billElement2);
			 s9.selectByVisibleText(line);	 
			 }
			 @FindBy(xpath = "//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[3]/td[4]/input[1]")
			 private WebElement clickElement2;
			 public void click()
			 {
				 clickElement2.click();
			 }
			 @FindBy(xpath = "//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
			 private WebElement clickmElement;
			 public void enter()
			 {
				 clickmElement.click();
			 }
}