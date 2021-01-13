package mvnOpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MvnBrowser {

	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver87\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void openBrowser() {
		driver.get("https://stackoverflow.com/questions/51514680/how-to-make-testng-open-one-browser-at-a-time");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
