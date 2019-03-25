package class01;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class test01 {
  public static WebDriver driver;
  public static String url;
  @BeforeClass
  public static void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	  driver = new ChromeDriver();
    url = "http://localhost:8080/examsys/index.thtml";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
  public void testUntitled() throws Exception {
    driver.get(url);
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("hujianming");
    driver.findElement(By.name("userpass")).clear();
    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
    new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("管理员");
    Thread.sleep(10000);
    driver.findElement(By.cssSelector("button.tm_btn")).click();
    driver.switchTo().frame("main");
    String a=driver.findElement(By.xpath("/html/body/div/div[1]/ul")).getText();
    System.out.println(a);
    if(a!="null") {
    	System.out.println("登录成功");
    }else {
    	System.out.println("登录失败");
    }}
//  public void xztk() {
//		driver.switchTo().frame("menu");
//	    driver.findElement(By.linkText("题库管理")).click();
//	    driver.findElement(By.linkText("新增题库")).click();
//	    driver.switchTo().defaultContent();
//	    driver.switchTo().frame("main");
//	    driver.findElement(By.name("d_name")).sendKeys("selenium题库");
//	    driver.findElement(By.id("btn_photo")).click();
//	    driver.findElement(By.name("d_remark")).clear();
//	    driver.findElement(By.name("d_remark")).sendKeys("用于selenium考生考试");
//	    driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
//	    driver.findElement(By.id("tm_lnk_back")).click();
//	}
//  public void xzbj() {
//	  driver.switchTo().frame("menu");
//	  driver.findElement(By.linkText("学生管理")).click();
//      driver.findElement(By.linkText("班级管理")).click();
//      driver.switchTo().defaultContent();
//      driver.switchTo().frame("main");
//      driver.findElement(By.linkText("新增班级")).click();
//      driver.findElement(By.name("b_name")).sendKeys("测试4班");  
//      WebElement element=driver.findElement(By.className("tm_select"));
//      Select s1=new Select(element);
//      s1.selectByIndex(0);
//      driver.findElement(By.className("tm_txt")).sendKeys("该班级用于软件测试的教学");
//      driver.findElement(By.className("tm_btn tm_btn_primary")).click();
//  }
  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }}

