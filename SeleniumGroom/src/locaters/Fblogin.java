package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("admin");
driver.findElement(By.name("pass")).sendKeys("admin@123");
driver.findElement(By.name("login")).click();
Thread.sleep(5000);
driver.close();
	}

}
