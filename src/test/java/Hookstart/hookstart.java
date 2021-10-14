package Hookstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hookstart {
	
public static WebDriver driver;
	
	@Before
	public void initialization() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soham Yadav\\Documents\\CG workspace\\Capgemini1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/index.php");
	    Thread.sleep(5000);
	}
	
	@After
	public void closerdriver() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Brouser is closing how");
		driver.quit();
	}

}
