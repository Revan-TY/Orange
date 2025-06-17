package script_sanjay01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://practice.expandtesting.com/dropdown#google_vignette");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	 WebElement ele = driver.findElement(By.id("country"));
     Select dropdown=new Select(ele);
 	Thread.sleep(2000);

     dropdown.selectByVisibleText("Iceland");  
     

}
}
