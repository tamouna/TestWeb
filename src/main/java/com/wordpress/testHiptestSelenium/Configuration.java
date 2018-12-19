package com.wordpress.testHiptestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuration {
	
	private static WebDriver driver;
	private static int testSteps;
	private static String testPlatform;
	
	
	public static void open(String url){
		driver.get(url);
	}
	
	public static void close(){
		driver.close();
	}
	
	public static WebDriver driver() {
		return driver;
	}
	
	public static void setdriver(WebDriver driver) {
		Configuration.driver = driver;
	}

}
