package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flipkart.Flipkart;
import flipkart.HTMLReportGenerator;

public class Login 
{

	@When("^user open \"([^\"]*)\" browser with exe as$")
	public void user_open_browser_with_exe(String bname) throws Throwable 
	{
		Object[] input=new Object[2];
		input[0]=bname;
	    Flipkart.browserLaunch(input);	
	}

	@When("^user open URL as$")
	public void user_open_URL_as() throws Throwable
	{
		 Flipkart.openApplication();	
	}

	@When("^user cancle initial login window$")
	public void user_cancle_initial_login_window() throws Throwable 
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		 Flipkart.clickOnElement(input2);	
	}

	@When("^user navigate on login button$")
	public void user_navigate_on_login_button() throws Throwable
	{
		Thread.sleep(3000);
		 Object[] input3=new Object[1];
		 input3[0]="//*[text()='Login']";
		 Hashtable<String, Object> output3= Flipkart.moveToElement(input3);
		
	}

	@When("^user click on Myprofile$")
	public void user_click_on_Myprofile() throws Throwable
	{
		Thread.sleep(5000);
		 Object[] input4=new Object[1];
		 input4[0]="//*[text()='My Profile']";
		 Hashtable<String, Object> output4= Flipkart.clickOnElement(input4);
		 HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on Myprofile$", output4.get("MESSAGE").toString());
		 
	}

	@When("^user \"([^\"]*)\" as username$")
	public void user_as_username(String uName) throws Throwable
	{
		Thread.sleep(5000);
		Object[] input5=new Object[2];
		 input5[0]="(//*[@type='text'])[2]";
		 input5[1]=uName;
		 Hashtable<String, Object> output5= Flipkart.sendKeys(input5);
		 HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user \"([^\"]*)\" as username$", output5.get("MESSAGE").toString());
	}

	@When("^user \"([^\"]*)\" as password$")
	public void user_as_password(String passwd) throws Throwable 
	{
		Object[] input6=new Object[2];
		 input6[0]="//*[@type='password']";
		 input6[1]=passwd;
		 Hashtable<String, Object> output6= Flipkart.sendKeys(input6);
		 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user \"([^\"]*)\" as password$", output6.get("MESSAGE").toString());
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable
	{

		 Object[] input7=new Object[1];
		 input7[0]="(//*[@type='submit'])[2]";
		 Hashtable<String, Object> output7= Flipkart.clickOnElement(input7);
		 HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on login button$", output7.get("MESSAGE").toString());
	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable
	{
		Thread.sleep(5000);
		Object[] input8=new Object[2];
		 input8[0]="//*[@class='_1ruvv2']";
		 input8[1]="Dhananjay Sukale";
		 Hashtable<String, Object> output8=Flipkart.validation(input8);
		 HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows user profile to user$", output8.get("MESSAGE").toString());
	}

	@Then("^browser close$")
	public void browser_close() throws Throwable 
	{

		Thread.sleep(5000);
		 Flipkart.browserClose();
	}


}
