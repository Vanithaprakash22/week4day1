package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 	 
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/frame.html");
		 //Maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("Click")).click();
		 
		 
		 
	}
	
}

