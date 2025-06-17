package Script_sanajy02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locaters.chromeDriver;

public class Demo
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new chromeDriver();
	driver.get("https://www.jio.com/selfcare/login/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.cssSelector("a[href='/mobile']"));
	ele.click();
}
}
