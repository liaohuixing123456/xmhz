package com.page;
import org.openqa.selenium.By;
import com.util.loginutil;
public class tikupage extends loginutil {
//�����ߵĲ˵�
	public void tzzb() {
		 driver.switchTo().frame("menu");
	}
	//���������
	public void tkgl() {
	    driver.findElement(By.linkText("������")).click();
	}
	//����������
	public void xztk() {
	    driver.findElement(By.linkText("�������")).click();
	}
	//��ת���ұ߿���ҷ��ص��ⲿ
	public void tkyb() {
		driver.switchTo().defaultContent();
	    driver.switchTo().frame("main");
	}
	//������������
	public void tkmc() {
		driver.findElement(By.name("d_name")).sendKeys("z");
	}
	//����ύ��ť
	public void tj() {
		 driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
	}
}
