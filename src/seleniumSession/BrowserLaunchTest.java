package seleniumSession;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserLaunchTest {

	public static void main(String[] args)
	{
		
		
		System.out.println("Test Start");
		System.out.println("Enter Browser name======>>>");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		WebDriver driver = null;
		
		if(x.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SWDTest\\chromedriver_win32_2\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\SWDTest\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(x.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver", "F:\\SWDTest\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver = new OperaDriver();
		}
		else if(x.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\SWDTest\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Browser not Found in System*********");
		}
		System.out.println("Test End");
	}

}
