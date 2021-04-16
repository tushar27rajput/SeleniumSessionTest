package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Test Start");
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "F:\\SWDTest\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		Thread.sleep(2000);
		System.out.println("Test End");
	}

}
