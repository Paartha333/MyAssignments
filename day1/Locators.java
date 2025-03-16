package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
public static void main(String[] args) {
	/* steps to interact with the element
	 * 1) locate the element(find elemnt from dom)
	 * 2)interect the web elemnt (key interactions using ---- sendkeys and click)
	 * 3) Locate the element using (findelement)
	 * 
	 */
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize(); 
	//get the title
	//String title =driver.getTitle();
	//System.out.println(title);
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	WebElement pwrd =driver.findElement(By.id("password")); // Alternative for previous line
	pwrd.sendKeys("crmsfa");
	
	// click on login
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	//close the current window
	//driver.close();
	//close all the tabs which is open
	//driver.quit();
	//click on leads
	driver.findElement(By.linkText("Leads")).click();
	//click on createlead
	driver.findElement(By.partialLinkText("Create")). click();
	//enter company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
	//enter firstname
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Paartha");
	//enter lastname
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GM");
	//enter title
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Prime");
	
	
	//click source dropdown
	WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd1 = new Select(sourcedd);
	dd1.selectByIndex(2);
	
	//click industry dropdown
	WebElement industrydd = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd2 = new Select(industrydd);
	dd2.selectByValue("IND_SOFTWARE");
	
	//click ownership dropdown
	WebElement ownershipdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd3 = new Select(ownershipdd);
	dd3.selectByIndex(3);
	
	
	//click createlead button
	driver.findElement(By.className("smallSubmit")).click();
	
	String title =driver.getTitle();
	System.out.println("The title of the page is " + title);
	driver.close();
	
	}
	}

	

