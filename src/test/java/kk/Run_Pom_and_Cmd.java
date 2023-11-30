package kk;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Run_Pom_and_Cmd {
	
	WebDriver driver;
	Login_Page LP;

	@BeforeClass
	public void beforeClass() {
		
		//System.setProperty("webdriver.chrome.driver","Path");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html#");
		
		
	}

	@Test
	public void Test_1() {
		LP=new Login_Page(driver);
		String text =LP.Login_Success("Honey", "123");
		System.out.println(text);
		assertEquals(text,"Successfully Logged in...");
		
		
		
	
		
		
	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
	}

}
