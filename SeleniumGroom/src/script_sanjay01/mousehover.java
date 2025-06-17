package script_sanjay01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import locaters.chromeDriver;

public class mousehover 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://flipkart.com");
   WebElement log = driver.findElement(By.xpath("//span[.='Login']"));
	Thread.sleep(2000);
	Actions a=new Actions(driver);

	a.moveToElement(log).perform();
	
}
}
