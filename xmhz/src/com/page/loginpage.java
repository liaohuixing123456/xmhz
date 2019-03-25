package com.page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.util.loginutil;
public class loginpage extends loginutil{
	//打开网址
	public void openurl() {
		driver.get(Url);
	}
	//用户名输入
	public void setusername() {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("hujianming");
	}
	//密码输入
	public void setpassword() {
		driver.findElement(By.name("userpass")).clear();
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	}
	//选择类型
	public void selectlx() {
		 new Select(driver.findElement(By.name
				 ("usertype"))).selectByVisibleText("管理员");
	}
	//点击登录
	public void clicklogin() {
		driver.findElement(By.cssSelector("button.tm_btn")).click();
	}
	/*//新增题库
		public void xztk() {
			driver.switchTo().frame("menu");//跳转在左侧框架
		    driver.findElement(By.linkText("题库管理")).click();//点击题库管理的链接文本
		    driver.findElement(By.linkText("新增题库")).click();//点击新增题库的链接文本
		    driver.switchTo().defaultContent();//保留在新增题库上午页面
		    driver.switchTo().frame("main");//跳转至右侧框架
		    driver.findElement(By.name("d_name")).sendKeys("selenium题库");//输入selenium图库
		    driver.findElement(By.id("btn_photo")).click();//点击图标
		    driver.findElement(By.name("d_remark")).clear();//
		    driver.findElement(By.name("d_remark")).sendKeys("用于考生selenium考试");
		    driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
		    driver.findElement(By.id("tm_lnk_back")).click();
		}*/
	}
