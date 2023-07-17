package com.hashtag_assignement.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hashtag_assignement.utilities.Utilities;

public class ApplyJob {

	public WebDriver driver;
	public ApplyJob(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter your name']")
	private WebElement nametextbox;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailtextbox;
	
	@FindBy(xpath="//input[@placeholder='Enter your phone']")
	private WebElement phonetextbox;
	
	@FindBy(xpath="//input[@placeholder='Notice Period (Days)']")
	private WebElement noticeperiodtextbox;
	
	@FindBy(xpath="//input[@placeholder='Your Experience (Years)']")
	private WebElement experiencetextbox;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement resumeupload;
	
	@FindBy(xpath="//textarea[@placeholder='Briefly Describe Yourself']")
	private WebElement descriptiontextbox;
	
	@FindBy(xpath="//button[@class='btn form-button font-12 font-bold']")
	private WebElement applybutton;
	
	public void enterName(String name) {
		Utilities.waitForElement(driver, nametextbox);
		nametextbox.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		Utilities.waitForElement(driver, emailtextbox);
		emailtextbox.sendKeys(email);
	}
	
	public void enterPhone(String phone) {
		Utilities.waitForElement(driver, phonetextbox);
		phonetextbox.sendKeys(phone);
	}
	
	public void enterNotice(String notice) {
		Utilities.waitForElement(driver, noticeperiodtextbox);
		noticeperiodtextbox.sendKeys(notice);
	}
	
	public void enterExperience(String experience) {
		Utilities.waitForElement(driver, experiencetextbox);
		experiencetextbox.sendKeys(experience);
	}
	
	public void uploadResume(String resume) {
		Utilities.waitForElement(driver, resumeupload);
		resumeupload.sendKeys(resume);
	}
	
	public void enterDescription(String description) {
		Utilities.waitForElement(driver, descriptiontextbox);
		descriptiontextbox.sendKeys(description);
	}
	public void clickApplyButton() {
		Utilities.waitForElement(driver, applybutton);
		applybutton.click();
	}
	
	
	
	
}
