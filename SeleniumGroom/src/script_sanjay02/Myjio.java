package script_sanjay02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myjio
{
 public static void main(String[] args) throws InterruptedException 
 {
 System.setProperty("webdriver.chrome.driver","./softwares/chromeDriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.jio.com/selfcare/login/");
 WebElement mbl=driver.findElement(By.cssSelector("a[cust-url='/mobile']"));
 mbl.click();
 Thread.sleep(2000);
 WebElement rech=driver.findElement(By.cssSelector("html[lang='en']"));
 rech.click();
 //WebElement entr=driver.findElement(By.id("submitNumber"));
 //entr.sendKeys("8088149250");
 
 
 }
}
