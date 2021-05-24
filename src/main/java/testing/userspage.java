package testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class userspage {
			@FindBy(xpath = "//tbody/tr[1]/td[9]/a[1]/img[1]")
			private WebElement clickusers;
			public void clickusers()
			{
				clickusers.click();
			}
			public userspage()
			{
				PageFactory.initElements(Baseclass. driver,this);
			}
		@FindBy(xpath = "//input[@value='Create New User']")
		private WebElement createnewuser;
		public void newuser()
		{
			createnewuser.click();
		}
		@FindBy(xpath = "//input[@name='username']")
		private WebElement usernamElement;
		public void username(String uname)
		{
			usernamElement.sendKeys(uname);
		}
		@FindBy(xpath = "//input[@name='passwordText']")
		private WebElement passwordElement;
		public void password(String pwd)
		{
			passwordElement.sendKeys(pwd);
		}
		@FindBy(xpath = "//input[@name='passwordTextRetype']")
		private WebElement retypepwdElement;
		public void retypepwd(String re)
		{
			retypepwdElement.sendKeys(re);
		}
		@FindBy(name="active")
		private WebElement activeclickElement;
		public void active(String click)
		{
			Select s4=new Select(activeclickElement);
			s4.selectByVisibleText(click);
		}
		@FindBy(xpath = "//input[@name='firstName']")
		private WebElement firstname;
		public void firstnamed(String name)
		{
			firstname.sendKeys(name);
		}
		@FindBy(xpath = "//input[@name='lastName']")
		private WebElement lastnamElement;
		public void lastname(String last)
		{
			lastnamElement.sendKeys(last);
		}
		@FindBy(xpath = "//input[@name='middleName']")
		private WebElement middlenamElement;
		public void middle(String middle)
		{
			middlenamElement.sendKeys(middle);
		}
		@FindBy(xpath = "//input[@name='phone']")
		private WebElement phonenumberElement;
		public void phone(String phone)
		{
			phonenumberElement.sendKeys(phone);
		}
		@FindBy(xpath = "//input[@id='overtimeTracking_Enable']")
		private WebElement overtimElement;
		public void overtime()
		{
			overtimElement.click();
		}
		@FindBy(xpath = "//input[@value='   Create User   ']")
		private WebElement createcustomerElement;
		public void customer()
		{
			createcustomerElement.click();
		}
	
	}


