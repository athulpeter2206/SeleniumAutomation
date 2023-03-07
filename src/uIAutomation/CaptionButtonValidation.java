package uIAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptionButtonValidation {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "/E:/Programming/Java/SeleniumAutomation/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.verboseLogging", "true");
			driver.get("https://www.youtube.com");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Java Tutorials");
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//a[@id='video-title']/yt-formatted-string[contains(@aria-label,'Java Programming for Beginners ')]")).click();
			Thread.sleep(10000);
			if(driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']/div[@class='ytp-ad-text ytp-ad-skip-button-text']")).isDisplayed()) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']/div[@class='ytp-ad-text ytp-ad-skip-button-text']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("ytp-subtitles-button ytp-button")).click();

			}	
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
