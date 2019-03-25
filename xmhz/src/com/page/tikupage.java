package com.page;
import org.openqa.selenium.By;
import com.util.loginutil;
public class tikupage extends loginutil {
//点击左边的菜单
	public void tzzb() {
		 driver.switchTo().frame("menu");
	}
	//点击题库管理
	public void tkgl() {
	    driver.findElement(By.linkText("题库管理")).click();
	}
	//点击新增题库
	public void xztk() {
	    driver.findElement(By.linkText("新增题库")).click();
	}
	//跳转到右边框架且返回到外部
	public void tkyb() {
		driver.switchTo().defaultContent();
	    driver.switchTo().frame("main");
	}
	//输入题库的名称
	public void tkmc() {
		driver.findElement(By.name("d_name")).sendKeys("z");
	}
	//点击提交按钮
	public void tj() {
		 driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
	}
}
