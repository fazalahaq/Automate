package locator;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// Open chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev-erpuni.mightcode.com/");//open URL
		driver.manage().window().maximize(); // to maximize the window
		
		//Target the webelement by name
		
		driver.findElement(By.name("email")).sendKeys("alok.agrawal@unicodesystems.org");
		driver.findElement(By.id("//span[normalize-space()='Log In']")).sendKeys("Unicode@123");
		driver.find_element(By.xpath(//button[@type='submit']).click();		

	}

}
