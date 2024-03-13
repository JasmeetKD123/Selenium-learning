package flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFlipkart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(7000);
		
		List<WebElement> Items =driver.findElements(By.xpath("//div[contains(@class,'_2VHNef')]"));
		System.out.println(items.size());
		driver.quit();


		// TODO Auto-generated method stub

	}

}
