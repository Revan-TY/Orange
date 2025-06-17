package script_sanjay01;

import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreenshot{

public static void main(String[] args) throws IOException, InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://flipkart.com");
	Thread.sleep(2000);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 Files.copy(f, new File("C:\\Users\\HP\\Pictures\\abc.jpg"));
		Thread.sleep(1000);
		driver.close();




}}