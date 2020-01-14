package SeleniumPack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Seleniumclass {
	
	
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe" );
				//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
				//capabilities.setCapability("marionette",true);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/login/");
		WebElement username=driver.findElement(By.id("login_field"));
		username.sendKeys("abc123234");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("kidwainagar@1221");
		driver.findElement(By.className("btn-primary")).click();
		driver.get("https://github.com/settings/profile");
	// driver.findElement(By.id("registration_container")).click();
	//	driver.findElement(By.name("firstname")).sendKeys("Vedant");

	 /*WebElement Chkbox=driver.findElement(By.name("rememberMe"));
	  Chkbox.click();
	  {
		  if(Chkbox.isSelected())
		  {
			  System.out.println("Checkbox is on");
		  }
	  }*/
		/*WebElement radio=driver.findElement(By.className("_8esa"));
		  radio.click();
		  {
			  if(radio.isSelected())
			  {
				  System.out.println("radio is on");
		
	
	}
		  }*/
          Select dropCountry=new Select(driver.findElement(By.id("user_profile_spoken_language_preference_code")));
		 dropCountry.selectByVisibleText("Marathi");
		 
		 File Src=((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(Src,new File("C:/selenium/Error.png"));
	}
}
