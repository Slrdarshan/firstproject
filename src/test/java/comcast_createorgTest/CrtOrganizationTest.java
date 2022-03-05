package comcast_createorgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrtOrganizationTest {

	@Test
	public void  crtOrgTest() throws InterruptedException {
		
		System.out.println("creating a new organization");
		WebDriverManager.chromedriver().setup();
		String browser= System.getProperty("BROWSER");
		String url=System.getProperty("URL");
		
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		
		driver.get(url);
		
		Thread.sleep(4000);
		driver.close();
	}
	
	
	@Test
	public void modifyOrgTest() {
		System.out.println("modifing a organization");
	}
	
	
	
}
