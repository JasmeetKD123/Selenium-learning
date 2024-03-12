package formtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		//WebElement textBox =driver.findElement(By.name("my-text-id"));
		WebElement RadioButton1 = driver.findElement(By.id("my-radio-1"));
		WebElement RadioButton2 = driver.findElement(By.id("my-radio-2"));

		
		Boolean isEnabled =RadioButton1.isSelected();
		System.out.println(isEnabled);
	
		
		Boolean isSelected =RadioButton2.isSelected();
		System.out.println(isEnabled);
		System.out.println(isSelected);
		driver.quit();



	}

}
