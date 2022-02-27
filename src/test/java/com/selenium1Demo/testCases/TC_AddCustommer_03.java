package com.selenium1Demo.testCases;

import org.testng.annotations.Test;

import com.selenium1Demo.pageObjects.AddCustommer;
import com.selenium1Demo.pageObjects.LoginPage;

public class TC_AddCustommer_03 extends BaseClass {
	
	@Test
	
	public void addNewCustomerTest() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		logger.info("click on submit button submit");
		
		Thread.sleep(3000);
		
		AddCustommer ac = new AddCustommer(driver);
		
		ac.clickNewCustomer();
		logger.info("providing customer details.... ");
		
		ac.setCustomerName("Priyanka");
		//ac.setGenderMale();
		ac.setGenderFemale();
		ac.setDateOfBirth("02","23","1990");		
		ac.setAddress("20 Street,Qunicy Market");		
		ac.setCity("Boston");
		ac.setState("Mass");
		ac.setPin("123456");
		ac.setMobileNumber("846832635");
		ac.setMailId("priy23@yahoo.com");
		ac.setPassword("priyanka123");
		ac.clickSubmit();
		ac.clickReset();
		
		
		
		
		
		
	}
	
	

}
