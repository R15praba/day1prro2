package org.ter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mav {
	static WebDriver emp;
	private Mav() {
		
	}
	public static WebDriver obj() {	

	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murali\\eclipse-workspace\\V\\src\\org\\ter\\Mav.java");
	 emp= new ChromeDriver();
	 return emp;
	
	 
}






}
