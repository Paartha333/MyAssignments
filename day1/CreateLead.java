package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize(); 
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	WebElement pwrd =driver.findElement(By.id("password")); // Alternative for previous line
	pwrd.sendKeys("crmsfa");
	//click on login
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
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
	//click createlead button
	driver.findElement(By.className("smallSubmit")).click();
	
	String title =driver.getTitle();
	System.out.println("The title of the page is " + title);
	driver.close();
	
	}

}



