package testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.IStringConverterFactory;


public class taskspage {
		@FindBy(xpath="//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]/img[1]")
		private WebElement userbutton;
		public taskspage()
		{
			PageFactory.initElements(Baseclass. driver,this);
		}
		public void clickonuserbutton()
		{
			userbutton.click();
		}
		@FindBy(xpath = "//input[@value='Create New Tasks']")
		public WebElement createnewtask;
		public void clickoncreatenewtask()
		{
			createnewtask.click();
		}
      @FindBy(name="customerId")
      public WebElement custmerid;
      public void clickoncustomerid()
      {
    	  custmerid.click();
      }
	@FindBy(xpath="//option[contains(text(),'-- new customer --')]")	
	public WebElement newcutomer;
	public void clickonnewcustomer()
	{
		newcutomer.click();
	}
	@FindBy(xpath="//tbody/tr[@id='new_customer']/td[4]/input[1]")	
	public WebElement cutomername;
	public void enternewcustomername(String name)
	{
		cutomername.sendKeys(name);;
	}
	@FindBy(xpath="//tbody/tr[@id='new_project']/td[4]/input[1]")	
	public WebElement newprojectname;
	public void projectname(String project)
	{
		newprojectname.sendKeys(project);;
	}
	@FindBy(xpath="//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")	
	public WebElement textfield;
	public void textfield(String text)
	{
		textfield.sendKeys(text);;
	}
	@FindBy(xpath="//input[@id='taskDeadline0']")	
	public WebElement filldate;
	public void enterdate(String date)
	{
		filldate.sendKeys(date);
	}
	@FindBy(xpath="//tbody/tr[2]/td[3]/div[1]/select[1]")	
	public WebElement bill;
	public void enterbill(String billupdate)
	{
		Select s2=new Select(bill);
		s2.selectByVisibleText(billupdate);
	}
		@FindBy(xpath="//tbody/tr[2]/td[4]/input[1]")	
		public WebElement checkbox;
		public void entercheckbox()
		{
			checkbox.click();
		}
			@FindBy(xpath="/html[1]/body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")	
			public WebElement entersecoundtextfiled;
			public void secoundtextfield(String secoundtext)
			{
				entersecoundtextfiled.sendKeys(secoundtext);
			}
				@FindBy(xpath="//input[@id='taskDeadline1']")	
				public WebElement fillsecounddate;
				public void dateandyeaar(String secounddate)
				{
					fillsecounddate.sendKeys(secounddate);
				}
				
					@FindBy(xpath="//tbody/tr[3]/td[3]/div[1]/select[1]")	
					public WebElement billupdate;
					public void clickonnewcustomr(String billdata)
					{
						Select s3=new Select(billupdate);
						s3.selectByVisibleText(billdata);					
					}
@FindBy(xpath = "//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[3]/td[4]/input[1]")
public WebElement checkbox2;
public void checkboxclick()
{
	checkbox2.click();
}

@FindBy(xpath = "//body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
public WebElement clickbutton;
public void clickbottons()
{
	clickbutton.click();
}
@FindBy(id="RemainOnThePageButton")
public WebElement clickonremainpage;
public void remainpage()
{
	clickonremainpage.click();
}

@FindBy(xpath = "//input[@value='Remain on the Page']")
public WebElement remainthepage;
public void clickonremainpage()
{
	remainthepage.click();
}

}
