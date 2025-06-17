package script_sanjay01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname 
{
 public static void main(String[] args) throws InterruptedException 
 {
	System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://youtube.com");
	WebElement src=driver.findElement(By.cssSelector("input[type='text']"));
	src.sendKeys("shiva shiva kannada song");
	WebElement sch =driver.findElement(By.cssSelector("button[aria-label='Search']"));
	sch.click();
	Thread.sleep(3000);
	WebElement clk=driver.findElement(By.id("video-title"));
	clk.click();
	
}
}
