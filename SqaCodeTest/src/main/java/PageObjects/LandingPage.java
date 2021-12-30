package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	 WebDriver driver;
	 
	 public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			 this.driver=driver;
		}
	 
	 
	 By SearchBtn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/header/div/div/div[2]/div[2]/div[1]/div[2]/input");
	 By ChoseContent= By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[1]/div/div[2]/div/a/div/div/div/div[2]/h4");
	 By CancelAddBtn = By.xpath("/html/body/div[1]/div[3]/div/div[2]/button");
	 
	


	public  WebElement serachCcon() {
		 return driver.findElement(SearchBtn) ;
	 }
	public  WebElement loadContent() {
		 return driver.findElement(ChoseContent) ;
	 }
	public  WebElement RemoveAdd() {
		 return driver.findElement(CancelAddBtn) ;
	 }

}

