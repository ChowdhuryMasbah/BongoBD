package BongoBd.SqaCodeTest;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


import BongoBd.SqaCodeTest.Base;
import PageObjects.LandingPage;

public class PlayFreeContent extends Base {

	@Test
	public void findcontent() throws IOException, InterruptedException{
		driver = initialzeddriver();
		driver.manage().window().maximize();
		driver.get("https://bongobd.com");
		
		LandingPage lp=new LandingPage(driver);
		lp.serachCcon().click();
		lp.serachCcon().sendKeys("Birds Eye");
		lp.serachCcon().sendKeys(Keys.RETURN);
		lp.loadContent().click();
		
		
	
		
	}

}
