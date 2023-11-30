package kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class Login_Page 
{
	WebDriver driver;
	public Login_Page(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	
// We can call elements two types
//    @FindBy(how=How.ID, using ="email")
//     WebElement Email_Box;
	
	By email = By.id("email");
	By pass = By.id("passwd");
	By button = By.id("SubmitLogin");
	By login_text=By.xpath("//div[@class='error-copy']");
	
	public String Login_Success(String name, String password) {
	
		driver.findElement(email).sendKeys(name);
		//Email_Box.sendKeys(name);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(button).click();
		String text =driver.findElement(login_text).getText();
		return text;
	
		
		
		
		
	}
	
	
	
   
}
