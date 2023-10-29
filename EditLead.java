package Week1.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	
	driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Prabhu");
	
	driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	String tit= driver.getTitle();
	System.out.println(tit);
	driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
	
	WebElement cc= driver.findElement(By.xpath("(//input[@type='text'])[29]"));
	cc.clear();
	cc.sendKeys("Leaf");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	
	driver.close();
	}
}
