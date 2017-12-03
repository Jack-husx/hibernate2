package com.itsteed.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itsteed.domain.User;
import com.itsteed.utils.HibernateUtils;

public class Demo1 {
	
	@Test
	public void run3(){
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		
		User user = new User();
		
		user.setName("小泽");
		user.setAge(48);
		
		tr.commit();
		session.close();
		
	}
	
	
	@Test
	public void run2(){
		
	}
	
	
	
	@Test
	public void run1(){
		
	}

}
