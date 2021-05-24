package testing;

import org.testng.annotations.Test;

public class finalrun extends Baseclass{
 


		@Test
		public void finalrun() 
		{
			taskspage ts=new taskspage();
		ts.clickonuserbutton();
		ts.clickoncreatenewtask();
		ts.clickoncustomerid();
		ts.clickonnewcustomer();
		ts.enternewcustomername("nagendra babu");
		ts.projectname("app testing");
		ts.textfield("emtere new testcase over");
		ts.enterdate("may 18,2021");
		ts.enterbill("Billable");
		ts.entercheckbox();
		ts.secoundtextfield(" two is   going process");
		ts.dateandyeaar("may 26,2022"); 
		ts.clickonnewcustomr("Non-Billable");
		ts.checkboxclick();
		ts.clickbottons();
		userspage u=new userspage();
		u.clickusers();
		u.newuser();
		u.username("nagendra");
		u.password("nagendra@1");
		u.retypepwd("nagendra@1");
		u.active("enabled");
		u.firstnamed("nagendra");
		u.lastname("babu"); 
		u.middle("rowdy");
		u.phone("9909909901");
		u.overtime();
		u.customer();
		projectsandcutomerspage pc=new projectsandcutomerspage();
		pc.projectsclick();
		pc.projndcus();
		pc.createnewcustomer();
		pc.customername("balu");
		pc.descripton("application testing over");
		pc.addproject();
		pc.createcustomer();
		pc.entername("app project");
		pc.description("application   is ongoing process");
		pc.taskaction();
		pc.project();
		pc.ntername("enternamElement2");
		pc.datendyear("may 20,2021");
		pc.billstatus("Billable");
		pc.clickthebutton();
		pc.enternam("testing is ongoing");
		pc.taskdeadline("june 10,2022");
		pc.billname("Non-Billable");
		pc.enter();
//ts.clickonremainpage();

			
			
			
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
