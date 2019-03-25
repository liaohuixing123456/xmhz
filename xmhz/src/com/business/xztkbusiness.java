package com.business;
import com.page.baseppage;
import com.page.tikupage;
public class xztkbusiness  {
baseppage base=new baseppage();
	tikupage tiku=new tikupage();
		//新增题库的操作
		public void xztk() {
			base.tzzb();
			tiku.tkgl();
			tiku.xztk();
			base.tzyb();
			tiku.tkmc();
			tiku.tj();
		}
	}


