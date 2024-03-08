package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
	public static void main(String[] args) {
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("File:///C:/Users/Public/Documents/Sample.html");
			
		
		  By MaleRadioButton = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("input[@value]"));
		  Driver.findElement(MaleRadioButton).click();
		  Driver.quit();
	 
	
		
	}

}
