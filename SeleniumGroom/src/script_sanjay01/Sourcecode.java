package script_sanjay01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sourcecode
{
 public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver","./softwares/chromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://fb.com");
	String src=driver.getPageSource();
	System.out.println(src);
	
}
}
