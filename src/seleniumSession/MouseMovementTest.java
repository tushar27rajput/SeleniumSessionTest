package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementTest {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Test Start");
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "F:\\SWDTest\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Covid-19 RT-PCR Test")).click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Test End");
	}

}
