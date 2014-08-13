package com.mall.dubbo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mall.dubbo.dao.CourceDao;
import com.mall.dubbo.entity.Cource;

public class CourceTest {

	private ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-mybatis.xml");
	
	//@Test
	public void addCource(){
		
		Cource cource = new Cource();
		cource.setCourceName("English");
		cource.setId(2);
		cource.setTeacherId(1);
		
		CourceDao dao = context.getBean(CourceDao.class);
		
		dao.addCource(cource);
	}
	
	//@Test
	public void getCourceById(){
		
		CourceDao dao = context.getBean(CourceDao.class);
		
		Cource c = dao.selectById(1);
		
		System.out.println(c);
	}
	
	//@Test
	public void updateCourceById(){
		Cource cource = new Cource();
		cource.setCourceName("France");
		cource.setId(1);
		cource.setTeacherId(2);
		CourceDao dao = context.getBean(CourceDao.class);
		dao.updateCourceById(cource);
	}
	
	//@Test
	public void addCources(){
		CourceDao dao = context.getBean(CourceDao.class);
		dao.addCourecs();
	}
	
	@Test
	public void selectName(){
		CourceDao dao = context.getBean(CourceDao.class);
		String str = dao.selectName();
		System.out.println("//////////////"+str);
		
	}
}
