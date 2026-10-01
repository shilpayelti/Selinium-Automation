package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 //WebDriver driver = new ChromeDriver();
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--incognito");

	        // Pass options to ChromeDriver
	        WebDriver driver1 = new ChromeDriver(options);
		 
		 driver1.get("https://selenium-prd.firebaseapp.com/");
		 
		WebElement email=driver1.findElement(By.id("email_feild"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password=driver1.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		 WebElement login=driver1.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();
	}

}