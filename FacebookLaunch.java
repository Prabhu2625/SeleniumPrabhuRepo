package Week1.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLaunch {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Prabhu");
		
		driver.findElement(By.name("lastname")).sendKeys("M");
		
		driver.findElement(By.name("reg_email__")).sendKeys("7708338313");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Prabhu");
		
		WebElement D = driver.findElement(By.id("day"));
		Select DD = new Select(D);
		DD.selectByIndex(25);
		WebElement M = driver.findElement(By.id("month"));
		Select MM = new Select(M);
		MM.selectByValue("10");
		WebElement Y = driver.findElement(By.id("year"));
		Select YY = new Select(Y);
		YY.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}
}
