package Week1.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launchbrowser {

	public static void main(String[] args) {
		
		
		
		//launch the browsr
		ChromeDriver driver = new ChromeDriver();
		//launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Get the title
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("LeafOrg");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prabhu");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
		WebElement Drop= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select S = new Select(Drop);
		S.selectByVisibleText("Employee");
		WebElement Mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select SS = new Select(Mc);
		SS.selectByValue("CATRQ_AUTOMOBILE");
		WebElement Own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select O = new Select(Own);
		O.selectByIndex(5);
		WebElement C = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select Cc = new Select(C);
		Cc.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
	}
}