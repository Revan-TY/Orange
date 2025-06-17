import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen {
	public static void main(String[] args) throws IOException    {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https:www.youtube.com");
		 //Thread.sleep(1000);
			/* driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kfg trailer");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[id='video-title']")).click();
			 Thread.sleep(2000);*/
			 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  Files.copy(f, new File("C:\\Users\\HP\\Downloads\\Sample\\youtubescreenshort.jpg"));
	} 

}
