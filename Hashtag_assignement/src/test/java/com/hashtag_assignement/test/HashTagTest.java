package com.hashtag_assignement.test;

import org.testng.annotations.Test;

import com.hashtag_assignement.pom.ApplyJob;
import com.hashtag_assignement.utilities.Base;

public class HashTagTest extends Base{
	
	@Test
	public void openLink() {
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		
		ApplyJob applyJob = new ApplyJob(driver);
		applyJob.enterName("Smriti");
		applyJob.enterEmail("smrriti@gmail.com");
		applyJob.enterPhone("7634524614");
//		applyJob.enterNotice("90");
		applyJob.uploadResume("D:\\Eclipse Projects\\Automation\\Hashtag_assignement\\file\\Doc1.pdf");
		applyJob.enterDescription("I am applying for a QA Role");
//		applyJob.clickApplyButton();
	}

}
