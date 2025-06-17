package fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.facebook.com/r.php");
   Thread.sleep(2000);
   WebElement dd = driver.findElement(By.xpath("day"));
   Select s= new Select(dd);
   s.selectByVisibleText("20");
   
	}

}
