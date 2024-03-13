package TestNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.Debug;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@ Run All
public class Checkboxtest {

	private static final WebElement Chkbox = null;
	WebDriver driver;
	WebElement Checkbox;

	@BeforeClass

	public void Setup() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	Run | Debug
	public void testcase1() {
		//System.out.println("Test");
		driver.get("https://demo.seleniumeasy.come/basic-checkbox-demo.html");
		String title =driver.getTitle();
		String expectedTitle = "Selenium Easy - Checkbox demo for Automation using Selenium" ;
		Assert.assertEquals(title, expectedTitle);
	}
	@ Test
	Run | Debug
	public void testcase2() {
		WebElement Chkbox = driver.findElement(By.cssSelector("isAgeSelected"));
		Chkbox.click();
		System.out.println("After Select : " + Chkbox.isSelected());
		Assert.assertTrue(Chkbox.isSelected());
	}
	
	@Test
	Run|Debug
	public void Testcase3() {
		Chkbox.click();
		System.out.println("After UnSelect: " + Chkbox.isSelected());
		Assert.assertTrue(Chkbox.isSelected());
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();

	}
}
