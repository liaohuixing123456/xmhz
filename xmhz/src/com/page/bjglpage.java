package com.page;
import org.openqa.selenium.By;
import com.util.loginutil;
public class bjglpage extends loginutil{
//���ѧ������
	public void xs() throws InterruptedException {
//		driver.switchTo().frame("menu");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();  
	}
	//����༶����
	public void jb() {
		driver.findElement(By.linkText("�༶����")).click();
	}
	//��������༶
	public void xz() {
		/*driver.switchTo().defaultContent();
	    driver.switchTo().frame("main");*/
	    driver.findElement(By.linkText("�����༶")).click();
	}
	//�����������
	public void jgmc() {
		 driver.findElement(By.name("b_name")).clear();
		driver.findElement(By.name("b_name")).sendKeys("����");
	}
	//����ύ
	public void tj() {
		driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
	}
}
