package com.testcase;
import org.testng.annotations.Test;
import com.business.loginbusiness;
public class logintestcase extends loginbusiness{
	@Test
	public void login() throws Exception{
		loginbusiness l=new loginbusiness();
		l.openurl();
		l.loginb();
	}
}
