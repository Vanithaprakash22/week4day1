package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException  {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropdown1);

		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("4");


		Thread.sleep(3000);
		select.selectByVisibleText("Selenium");


		List<WebElement> listofOptions= select.getOptions();

		int size=   listofOptions.size();
		System.out.println("number of size:"+size);
		dropdown1.sendKeys("Loadrunner");
			
		
		WebElement multiSelect=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select multiSelectBox=new Select(multiSelect);
		
         multiSelectBox.selectByIndex(1);
         multiSelectBox.selectByIndex(4);
	}
}