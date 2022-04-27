package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 	 
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/Alert.html");
		 //Maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		

	// driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
//	 driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	 driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	// Alert alert = driver.switchTo().alert();
	 //String text = alert.getText();
	 //System.out.println(text);
	 
	// Thread.sleep(5000);
	 
	// alert.sendKeys("Abc");
	 //Thread.sleep(5000);
	 
	// alert.accept();
	 //alert.dismiss();
	 
	}

}
