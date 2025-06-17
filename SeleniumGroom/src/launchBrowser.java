import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowser {
public static void main(String[]args)
{
//	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
//]	WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver1= new FirefoxDriver();
}
}
