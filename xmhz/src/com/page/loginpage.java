package com.page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.util.loginutil;
public class loginpage extends loginutil{
	//����ַ
	public void openurl() {
		driver.get(Url);
	}
	//�û�������
	public void setusername() {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("hujianming");
	}
	//��������
	public void setpassword() {
		driver.findElement(By.name("userpass")).clear();
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	}
	//ѡ������
	public void selectlx() {
		 new Select(driver.findElement(By.name
				 ("usertype"))).selectByVisibleText("����Ա");
	}
	//�����¼
	public void clicklogin() {
		driver.findElement(By.cssSelector("button.tm_btn")).click();
	}
	/*//�������
		public void xztk() {
			driver.switchTo().frame("menu");//��ת�������
		    driver.findElement(By.linkText("������")).click();//���������������ı�
		    driver.findElement(By.linkText("�������")).click();//����������������ı�
		    driver.switchTo().defaultContent();//�����������������ҳ��
		    driver.switchTo().frame("main");//��ת���Ҳ���
		    driver.findElement(By.name("d_name")).sendKeys("selenium���");//����seleniumͼ��
		    driver.findElement(By.id("btn_photo")).click();//���ͼ��
		    driver.findElement(By.name("d_remark")).clear();//
		    driver.findElement(By.name("d_remark")).sendKeys("���ڿ���selenium����");
		    driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
		    driver.findElement(By.id("tm_lnk_back")).click();
		}*/
	}
