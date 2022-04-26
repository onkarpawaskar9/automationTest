package testing.amazon01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Users\\Vijay Thorat\\Downloads\\chromedriver.exe");		
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
		
    	driver.get("https://www.browserstack.com/");

	}

}
