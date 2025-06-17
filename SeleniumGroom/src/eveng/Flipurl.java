package eveng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipurl {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/HP/Desktop/facebook.html"); 
     Thread.sleep(1000);
     driver.findElement(By.id("a1")).click();
	}

}
