package Salesforce;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//1. Step: Launch the browser (Chrome / Edge / Firefox / Safari).
		ChromeDriver driver=new ChromeDriver(options);
		//2. Step: Load the specified URL (https://login.salesforce.com/).
		driver.get("https:login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//3. Step: Enter the Username, Password and click on the Login button.
		driver.findElement(By.id("username")).sendKeys("ragunath.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ganesan@1727");
		driver.findElement(By.id("Login")).click();	
		//4.Step: Click on the App Launcher toggle button.
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Marketing");
		driver.findElement(By.xpath("//div[@class='slds-app-launcher__tile-body slds-truncate']")).click();
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none'])[2]")).click();
		WebElement we = driver.findElement(By.xpath("//a[@role='menuitem']"));
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();",we);
		driver.findElement(By.xpath("//input[@name='MobilePhone']")).sendKeys("9677193025");
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Mr.']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gopinath");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Moorthy");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("CGS");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//a[@name='Convert']")).click();
		Thread.sleep(3000);
		WebElement s1 = driver.findElement(By.xpath("(//span[text()='Opportunity']/following::button)[1]"));
		s1.click();
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.xpath("(//input[@class=' input'])[4]"));
		ele2.clear();
		ele2.sendKeys("RVC");
		System.out.println(ele2.getText());
	
		driver.findElement(By.xpath("//span[@data-aura-class='runtime_sales_leadConvertModalFooter']//button")).click();
		driver.findElement(By.xpath("//button[text()='Go to Leads']")).click();
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Gopinath Moorthy",Keys.ENTER);
		WebElement s2 = driver.findElement(By.xpath("//span[text()='No items to display.']"));
		System.out.println(s2.getText());
		
		WebElement s3 = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[8]"));
		driver.executeScript("arguments[0].click();",s3);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("RVC",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@data-refid='recordId'])[1]")).click();
		WebElement s4 = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		System.out.println(s4.getText());
		String s5="RVC";
		
		if (s5.equals(s4.getText())) {
			System.out.println("same name");
		}
		else {
			System.out.println("not same name");
		}
	}

}

