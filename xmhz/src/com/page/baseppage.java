package com.page;
import com.util.loginutil;
public class baseppage extends loginutil {
	//�����ߵĲ˵�
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
		//��ת���ұ߿���ҷ��ص��ⲿ
		public void tzyb() {
			driver.switchTo().defaultContent();
		    driver.switchTo().frame("main");
		}
		}


