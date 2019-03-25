package com.testcase;
import org.testng.annotations.Test;
import com.business.loginbusiness;
import com.business.xzbjbusiness;
import com.util.loginutil;
@Test
public class bjgl extends loginutil{
loginbusiness f=new loginbusiness();
public void g() throws Exception {
	f.openurl();
	f.loginb();
	Thread.sleep(3000);
xzbjbusiness e=new xzbjbusiness();	
	e.xzbj();
}
}
