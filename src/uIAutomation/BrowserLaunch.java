//Validating the Search Bar Functionality - If Contents in the Search bar is automatically Cleared or not upon Clicking Home Button.
//Result -- Test Failed!

package uIAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/athul/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.verboseLogging", "true");
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Java Tutorials");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[@id='items']//a[@title='Home']//tp-yt-paper-item")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='search']")).clear();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("C++ Tutorials");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

		driver.quit();
	}
}
