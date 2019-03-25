package com.util;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class loginutil {
	 public static WebDriver driver;
	  public static String Url;
	 @BeforeClass
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		  driver = new ChromeDriver();
		  DesiredCapabilities a=DesiredCapabilities.chrome();
		  WebDriver driver=new RemoteWebDriver(new URL( "http://169.254.246.238:7979/wd/hub/"),a);
	    Url = "http://localhost:8080/examsys/index.thtml";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	 @AfterClass
	 public void tearDown() throws Exception {
	   //driver.quit(); 
	 }
}

