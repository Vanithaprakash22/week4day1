package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();


		//driver.findElement(By.xpath("//a[@class='selected']")).click();

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		WebElement firstImage=driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']"));
		firstImage.click();
		
	
		
		
//		String firstWindow = driver.getWindowHandle();
//		System.out.println(firstWindow);

Set<String> allWindowHandles = driver.getWindowHandles();

List<String> listHandles=new ArrayList<String>(allWindowHandles);

String secondWindowhandle=listHandles.get(1);

driver.switchTo().window(secondWindowhandle);

driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"))
.click();						

driver.switchTo().window(listHandles.get(0));

driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();


driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[2]"))
.click();

		WebElement alertBox= driver.findElement(By.xpath("//a[text()='Merge']"));
		alertBox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		String title=driver.getTitle();
		System.out.println(title);



									
	}



}
