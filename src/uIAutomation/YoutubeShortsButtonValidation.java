package uIAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeShortsButtonValidation {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "/E:/Programming/Java/SeleniumAutomation/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.verboseLogging", "true");
			driver.get("https://www.youtube.com");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			
			driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Shorts')]")).click();
			if(driver.findElement(By.xpath("//video[@class='video-stream html5-main-video']")).isDisplayed()) {
				System.out.println("Youtube Shorts Displayed! Test Passed");
			}
			else {
				System.out.println("Element Not Found Test Failed!");
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
