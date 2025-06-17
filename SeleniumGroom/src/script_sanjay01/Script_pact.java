package script_sanjay01;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import locaters.chromeDriver;

public class Script_pact
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://flipkart.com");
	WebElement ele = driver.findElement(By.xpath("//span[.='Login']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
}
}
