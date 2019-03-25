package com.testcase;
import org.testng.annotations.Test;
import com.business.loginbusiness;
import com.business.xztkbusiness;
import com.util.loginutil;
@Test
public class xztktestcase extends loginutil {
	loginbusiness l=new loginbusiness();
	xztkbusiness m=new xztkbusiness();
	public void login() throws Exception{
    l.openurl();
	l.loginb();
	m.xztk();
}
}
