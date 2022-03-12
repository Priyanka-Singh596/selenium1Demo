package com.selenium1Demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustommer {

	WebDriver ldriver;
	
	public AddCustommer(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
		
			}
	@FindBy(how=How.XPATH,using="//a[contains(@href,'addcustomerpage.php')]")
	WebElement linkAddInNewCustomer;
	
	@FindBy(how=How.NAME,using="name")
	WebElement textCustomerName;
	
	@FindBy(how=How.XPATH,using="//input[@value='m']")
	WebElement selectGenderMale;
	
	@FindBy(how=How.XPATH,using="//input[@value='f']")
	WebElement selectGenderFemale;
	
	@FindBy(how=How.ID,using="dob")
	WebElement textDateOfBirth;
	
	@FindBy(how=How.NAME,using="addr")
	WebElement textAddress;
	
	@FindBy(how=How.NAME,using="city")
	WebElement textCity;
	
	@FindBy(how=How.NAME,using="state")
	WebElement textState;
	
	@FindBy(how=How.NAME,using="pinno")
	WebElement textPin;
	
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement textMobileNumber;
	
	@FindBy(how=How.NAME,using="emailid")
	WebElement textEmailId;
	
	@FindBy(how=How.NAME,using="password")
	WebElement textPassword;
	
	@FindBy(how=How.NAME,using="sub")
	WebElement clickSubmit;
	
	@FindBy(how=How.NAME,using="res")
	WebElement clickReset;
	
	public void clickNewCustomer()
	{
	linkAddInNewCustomer.click();
	}
	
	
	
	public void setCustomerName(String cname)
	{
		textCustomerName.sendKeys(cname);
	
		}
	
	public void setGenderMale()
	{
		selectGenderMale.click();
	}
	
	public void setGenderFemale()
	{
		selectGenderFemale.click();
	}
	
	public void setDateOfBirth(String mm, String dd, String yy)
	{
		textDateOfBirth.sendKeys(mm);
		textDateOfBirth.sendKeys(dd);
		textDateOfBirth.sendKeys(yy);
	}
	
	public void setAddress(String add)
	{
		textAddress.sendKeys(add);
	}
	
	public void setCity(String city)
	{
		textCity.sendKeys(city);
	}
	
	public void setState(String state)
	{
		textState.sendKeys(state);
	}
	
	public void setPin(String pin)
	{
		textPin.sendKeys(pin);
	}
	
	public void setMobileNumber(String mnumber)
	{
		textMobileNumber.sendKeys(mnumber);
	}
	
	public void setMailId(String mid)
	{
		textEmailId.sendKeys(mid);
	}
	
	public void setPassword(String pwd)
	{
		textPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		clickSubmit.click();
	}
	
	public void clickReset()
	{
		clickReset.click();
	}
}
