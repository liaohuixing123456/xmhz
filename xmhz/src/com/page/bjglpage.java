package com.page;
import org.openqa.selenium.By;
import com.util.loginutil;
public class bjglpage extends loginutil{
//点击学生管理
	public void xs() throws InterruptedException {
//		driver.switchTo().frame("menu");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();  
	}
	//点击班级管理
	public void jb() {
		driver.findElement(By.linkText("班级管理")).click();
	}
	//点击新增班级
	public void xz() {
		/*driver.switchTo().defaultContent();
	    driver.switchTo().frame("main");*/
	    driver.findElement(By.linkText("新增班级")).click();
	}
	//输入机构名称
	public void jgmc() {
		 driver.findElement(By.name("b_name")).clear();
		driver.findElement(By.name("b_name")).sendKeys("测试");
	}
	//点击提交
	public void tj() {
		driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
	}
}
