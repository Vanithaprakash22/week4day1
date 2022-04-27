package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAssignement {
	public static void main(String[] args) throws IOException  {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		
		File source = driver.getScreenshotAs(OutputType.FILE);
	
		File destination = new File("./snaps/screenshot.png");
		
		FileUtils.copyFile(source, destination);
		
		
		driver.switchTo().frame(0);		
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		
      driver.switchTo().defaultContent();       
       
       driver.switchTo().frame(1);
       driver.switchTo().frame("frame2");
       WebElement button2=driver.findElement(By.id("Click1"));
       button2.click();
       
       driver.switchTo().defaultContent();
       
		List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
		
	int size=totalFrames.size();
	System.out.println(size);
	
	
	
}
}