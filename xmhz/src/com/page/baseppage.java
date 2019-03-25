package com.page;
import com.util.loginutil;
public class baseppage extends loginutil {
	//点击左边的菜单
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
		//跳转到右边框架且返回到外部
		public void tzyb() {
			driver.switchTo().defaultContent();
		    driver.switchTo().frame("main");
		}
		}


