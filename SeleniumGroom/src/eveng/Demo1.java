package eveng;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.switchTo().alert();	}

}
