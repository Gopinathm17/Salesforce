package Salesforce;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesforceAccounts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https:login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("ragunath.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ganesan@1727");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Accounts");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("bryan");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		driver.findElement(By.xpath("//button[@name='Global.NewContact']")).click();
		
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("(//ul[@class='scrollable']//li)[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("ipog");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("bryan");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand cuf-publisherShareButton undefined uiButton']")).click();
		Thread.sleep(2000);
		WebElement s2 = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']"));
		driver.executeScript("arguments[0].click();" ,s2);
		driver.findElement(By.xpath("//a[@name='Delete']")).click();
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		Thread.sleep(4000);
		
		
		WebElement s3 = driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[5]"));
		driver.executeScript("arguments[0].click();" ,s3);
		Thread.sleep(4000);
		WebElement s4 = driver.findElement(By.xpath("//input[@name='Contact-search-input']"));
		s4.click();
		s4.sendKeys("bryan",Keys.ENTER);
		WebElement s1 = driver.findElement(By.xpath("//span[text()='No items to display.']"));
		System.out.println(s1.getText());
		
			
		
		
		
		
	}

}




/*
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


driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[3]")).click();
Thread.sleep(2000);
WebElement nc = driver.findElement(By.xpath("//span[text()='New Contact']"));
driver.executeScript("arguments[0].click()",nc);
driver.findElement(By.xpath("//button[@name='salutation']")).click();
driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Mr.']")).click();
driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gopinath");
driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Moorthy");
driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//span[text()='Leads']")).click();
driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]")).click();
driver.findElement(By.xpath("//button[@title='Delete']")).click();

driver.findElement(By.xpath("//a[@title='Contacts']")).click();
driver.findElement(By.xpath("(//input[@class='slds-input'])[1]")).sendKeys("Gopinath",Keys.ENTER);
*/