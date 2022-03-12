package com.selenium1Demo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium1Demo.pageObjects.AddCustommer;
import com.selenium1Demo.pageObjects.LoginPage;

public class TC_AddCustommer_03 extends BaseClass {
	
	@Test
	
	public void addNewCustomerTest() throws InterruptedException, IOException
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
		
		ac.setCustomerName("Vani");
		//ac.setGenderMale();
		ac.setGenderFemale();
		ac.setDateOfBirth("07","20","1999");		
		ac.setAddress("20 kessler farm");		
		ac.setCity("Boston");
		ac.setState("Mass");
		ac.setPin("123456");
		ac.setMobileNumber("846832635");
		ac.setMailId("sdgshds@yahoo.com");
		ac.setPassword("priya123");
		ac.clickSubmit();
		//ac.clickReset();
		
Thread.sleep(3000);
		
		logger.info("validation started...");
		
		boolean taskcompleted = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(taskcompleted == true) {
			
			Assert.assertTrue(true);
			logger.info("test case passed");
			
		}
		
		else
		{
			logger.info("test case failed..!!");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			
		}
		
		
		
	}


		
		
		
		
		
		
	}
	
	
