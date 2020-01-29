package org.ter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Micro {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murali\\eclipse-workspace\\V\\drf\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tspsconetimereg.tspsc.gov.in/oneTimeRegistration.tspsc");
	driver.findElement(By.id("aadhdarNo")).sendKeys("963258741247");
	driver.findElement(By.id("aadhdarName")).sendKeys("rajanikanth");
	driver.findElement(By.id("candidateName")).sendKeys("rajanikanth");
	driver.findElement(By.xpath("//input[@value='M']")).click();
	driver.findElement(By.id("dob")).click();
	WebElement ddn = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s = new Select(ddn);
	s.selectByVisibleText("1992");
	WebElement ddn1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s1 = new Select(ddn1);
	s1.selectByVisibleText("Nov");
	driver.findElement(By.xpath("//a[text()='2']")).click();
	WebElement d3 = driver.findElement(By.id("nativeDistrict"));
	Select s3 = new Select(d3);
	s3.selectByVisibleText("Other than Telangana State");
	driver.findElement(By.id("otherTS")).sendKeys("Tamilnadu");
	WebElement d4 = driver.findElement(By.id("OthetTsState"));
	Select s4 = new Select(d4);
	s4.selectByVisibleText("Tamil Nadu");
	WebElement d5 = driver.findElement(By.id("community"));
	Select s5 = new Select(d5);
	s4.selectByValue("2");
	driver.findElement(By.id("fatherName")).sendKeys("msb");
	driver.findElement(By.id("motherName")).sendKeys("subbu");
	WebElement d6 = driver.findElement(By.id("motherTongue"));
	Select s6 = new Select(d6);
	s6.selectByVisibleText("Tamil");
	WebElement d7 = driver.findElement(By.id("religion"));
	Select s7 = new Select(d7);
	s7.selectByVisibleText("Hindu");
	driver.findElement(By.id("identificationMark1")).sendKeys("mole on chick");
	driver.findElement(By.id("identificationMark2")).sendKeys("mole on fore arm");
	driver.findElement(By.xpath("(//input[@title='Select Differently Abled Person'])[2]")).click();
	driver.findElement(By.xpath("(//input[@title='Select ExService Person ?'])[2]")).click();
	driver.findElement(By.xpath("(//input[@onclick='otherEnableCensus();'])[2]")).click();
	driver.findElement(By.xpath("(//input[@onclick='otherEnableNcc();'])[2]")).click();
	driver.findElement(By.xpath("(//input[@title='Select Are you a Employee?'])")).click();
	driver.findElement(By.xpath("(//input[@onclick='validateClaim();'])[2]")).click();
	driver.findElement(By.xpath("(//input[@onclick='validateAgeClaim();'])[2]"));
	driver.findElement(By.id("commAddress1")).sendKeys("1a");
	driver.findElement(By.id("commAddress2")).sendKeys("rrooiii st");
	driver.findElement(By.id("commAddress3")).sendKeys("cuddapaa");
	driver.findElement(By.id("commState")).sendKeys("Telangana");
	driver.findElement(By.id("commPincode")).sendKeys("314258");
	
	driver.findElement(By.id("perAddress1")).sendKeys("7g");
	driver.findElement(By.id("perAddress2")).sendKeys("mmm st");
	driver.findElement(By.id("perAddress3")).sendKeys("Thidirnagar");
	driver.findElement(By.id("perState")).sendKeys("Tamilnadu");
	driver.findElement(By.id("perPincode")).sendKeys("600100");
	List<WebElement> list = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < list.size(); i++) {
		WebElement element = list .get(i);
		System.out.println(element.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}