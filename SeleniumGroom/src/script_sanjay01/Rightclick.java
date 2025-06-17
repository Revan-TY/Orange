package script_sanjay01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import locaters.chromeDriver;

public class Rightclick
{
public static void main(String[] args) throws InterruptedException, AWTException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://flipkart.com");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	WebElement product = driver.findElement(By.xpath("//img[@loading='lazy']"));
	Thread.sleep(2000);
	a.contextClick(product).perform();
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
