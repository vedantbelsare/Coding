package SeleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class regexeg {
	
	public static void main (String args[]) 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe" );
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette",true);
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.google.com");
		
		//String lgfld = "user[login]";
		//if ( lgfld.matches("[a-z][a-z][a-z].*"))
		WebElement we=driver.findElement(By.xpath("//*[@id='gbqfq']"));
		we.sendKeys("not able to see sponsored links on google search");
		driver.findElement(By.xpath("//*[@id='gbqfq']")).click();
		List <WebElement>allElements=driver.findElements(By.xpath("//h3/a"));
		for(WebElement element : allElements)
		{
			allElements.size();
			System.out.println(element.getText());
		}
		//radio.click();
		//username.sendKeys("abc12323");
		//WebElement password=driver.findElement(By.id("password"));
		//password.sendKeys("kidwainagar@1221");
		//driver.findElement(By.className("btn-primary")).click();
		//driver.get("https://github.com/settings/profile");

		/*String str="new World order 2020 vinmar";
		if(str.matches("new [A-Z][a-z]... [a-z].* 202[0-9] v[a-z].*"))
		
			System.out.println(true);
		else
			System.out.println(false);*/
		
	}
	
	

}
