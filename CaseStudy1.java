package CaseStudy;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class CaseStudy1 {

	public static void main(String[] args) {
		// setting the path for chromedriver browser into webdriver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saanvi\\Desktop\\Selenium Training\\Installation Stuff\\Drivers\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver(); //instantiating chromedriver class by a local variable driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saanvi\\Desktop\\Selenium Training\\Installation Stuff\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //instantiating chromedriver class by a local variable driver
		
		
		driver.get("https://www.edureka.co"); // open url
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); // maximize window
		// Inspecting searchBox element
		//WebElement searchBox = driver.findElement(By.id("search-inp")); // searchBox
		//searchBox.click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		//driver.findElement(By.className("search_inp collapse giTrackElementHeader")).click();
		
		// Inspecting Login button
		WebElement logIn = driver.findElement(By.xpath("//a[text()='Log In']"));
		logIn.click();
		
	}

}
