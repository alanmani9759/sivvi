package sivvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import retryanalyzer.RetryAnalyzer;

public class Act {
	static WebDriver driver;

	@Test(priority = 1)
	public static void tc_1() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.sivvi.com/uae-en/");
		driver.findElement(By.xpath("//div[@class='tk6alo-3 eTCfeV']")).click();

		WebElement newArrival = driver.findElement(By.xpath("//span[text()='New Arrivals']"));
		Actions action = new Actions(driver);
		action.moveToElement(newArrival).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"(//div[@class='sc-1y3iztb-9 kRlHIx']//child::div[@class='sc-1y3iztb-10 cXVeZg']//child::a[text()='Clothing'])[1]"))
				.click();

		driver.manage().window().maximize();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public static void tc_2() {
		System.out.println("nigga");
	}
}
