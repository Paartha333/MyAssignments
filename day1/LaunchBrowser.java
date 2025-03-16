package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	
	//Launch browser
ChromeDriver driver =new ChromeDriver();
//EdgeDriver driver1 =new EdgeDriver();
    //Load url
driver.get("https://www.facebook.com/");
//maximize
driver.manage().window().maximize(); 
//get the title
String title =driver.getTitle();
System.out.println(title);


	}
}
