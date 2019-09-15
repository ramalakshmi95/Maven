package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleProgram 
{
	@Test
public void testMethod()
{
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com");
		try
		{
			driver.get("https://www.w3schools.com");
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}

}
}
