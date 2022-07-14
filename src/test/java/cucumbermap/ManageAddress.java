package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flipkart.Flipkart;
import flipkart.HTMLReportGenerator;

public class ManageAddress 
{

	
	@When("^user click on manage address$")
	public void user_click_on_manage_address() throws Throwable
	{
	   Object[] input=new Object[1];
	   	input[0]="//*[@class='NS64GK']";
	   	Hashtable<String, Object> output=Flipkart.clickOnElement(input);
	   	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user click on manage address$", output.get("MESSAGE").toString());
	}

	@When("^user click on add new address$")
	public void user_click_on_add_new_address() throws Throwable 
	{
	   Object[] input1=new Object[1];
	   	input1[0]="//*[@class='_1QhEVk']";
	   	Hashtable<String, Object> output1=Flipkart.clickOnElement(input1);
	   	HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "^user click on add new address$", output1.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as name$")
	public void user_enter_as_name(String username) throws Throwable 
	{
	   Object[] input2=new Object[2];
	   	input2[0]="//*[@name='name']";
	   	input2[1]=username;
	   	Hashtable<String, Object> output2=Flipkart.sendKeys(input2);
	   	HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user enter \"([^\"]*)\" as name$", output2.get("MESSAGE").toString());
	   	
	}

	@When("^user enter \"([^\"]*)\" as mobile number$")
	public void user_enter_as_mobile_number(String phnno) throws Throwable
	{
	    Object[] input3=new Object[2];
	    	input3[0]="//*[@name='phone']";
	    	input3[1]=phnno;
	    	Hashtable<String, Object> output3=Flipkart.sendKeys(input3);
	    	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user enter \"([^\"]*)\" as mobile number$", output3.get("MESSAGE").toString());	
	}

	@When("^user enter \"([^\"]*)\" as pin code$")
	public void user_enter_as_pin_code(String pin) throws Throwable 
	{
	   Object[] input4=new Object[2];
	   	input4[0]="//*[@name='pincode']";
	   	input4[1]=pin;
	   	Hashtable<String, Object> output4=Flipkart.sendKeys(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user enter \"([^\"]*)\" as pin code$", output4.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as locality$")
	public void user_enter_as_locality(String area) throws Throwable
	{
	   Object[] input5=new Object[2];
	   	input5[0]="//*[@name='addressLine2']";
	   	input5[1]=area;
	   	Hashtable<String, Object> output5=Flipkart.sendKeys(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"([^\"]*)\" as locality$", output5.get("MESSAGE").toString());
	}

	@When("^user click on home as address type$")
	public void user_click_on_home_as_address_type() throws Throwable
	{
	    Object[] input6=new Object[1];
	    	input6[0]="//*[@class='_1XFPmK']";
	    	Hashtable<String, Object> output6=Flipkart.clickOnElement(input6);
	    	HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user click on home as address type$", output6.get("MESSAGE").toString());
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable
	{
	    Object[] input7=new Object[1];
	    	input7[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
	    	Hashtable<String, Object> output7=Flipkart.clickOnElement(input7);
	    	HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on save button$", output7.get("MESSAGE").toString());
	}

	@Then("^Application shows new address added to user$")
	public void application_shows_new_address_added_to_user() throws Throwable 
	{
	   Object[] input8=new Object[2];
	   	input8[0]="//*[@class='_3CfVDh'][1]";
	   	input8[1]="Jayesh Sukale";
		Hashtable<String, Object> output8=Flipkart.validation(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows new address added to user$", output8.get("MESSAGE").toString());
	}
	
	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String add1) throws Throwable 
	{
	   Object[] input9=new Object[2];
	   	input9[0]="//*[@name='addressLine1']";
	   	input9[1]=add1;
	   	Hashtable<String, Object> output9=Flipkart.sendKeys(input9);
	   	HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^user enter \"([^\"]*)\" as address$", output9.get("MESSAGE").toString());
	}
	
	@Then("^user navigate to options$")
	public void user_navigate_to_options() throws Throwable 
	{
		Thread.sleep(5000);
	   Object[] input10=new Object[1];
	   	input10[0]="//*[@class='dpjmKp'][1]";
		Hashtable<String, Object> output10=Flipkart.moveToElement(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user navigate to options$", output10.get("MESSAGE").toString());
	}

	@Then("^user select delete option$")
	public void user_select_delete_option() throws Throwable 
	{
	   Object[] input11=new Object[1];
	   	input11[0]="//*[text()='Delete'][1]";
		Hashtable<String, Object> output11=	Flipkart.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user select delete option$", output11.get("MESSAGE").toString());
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable 
	{
		Thread.sleep(5000);
	  Flipkart.browserClose();
	}

	@Then("^user click on delete$")
	public void user_click_on_delete() throws Throwable 
	{
	   Thread.sleep(5000);
	   Object[] input12=new Object[1];
	   	input12[0]="//*[@class='_2KpZ6l ZRrG8H _3AWRsL']";
	   	Hashtable<String, Object> output12=Flipkart.clickOnElement(input12);
	   	HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "^user click on delete$", output12.get("MESSAGE").toString());
	}
}
