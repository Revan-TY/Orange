import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbCss {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
	 driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
 
	}

}
