package com.mall.dubbo.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mall.dubbo.dao.DemoDao;
import com.mall.dubbo.entity.DemoVO;

public class DemoTest {

	private ApplicationContext aContext = new FileSystemXmlApplicationContext("classpath:spring-mybatis.xml");
	@Autowired
	private DemoDao demoDao;
	
	//@Test
	public void demoTest(){
		DemoDao demoDao = aContext.getBean(DemoDao.class);  
	    
	    System.out.println(demoDao.selectAll().toString());
	    
	}
	
	//@Test
	public void deleteDemoTest(){
		DemoDao demoDao = aContext.getBean(DemoDao.class);
		demoDao.deleteById(1);
	}
	//@Test
	public void insertDemoTest(){
		DemoVO demoVo = new DemoVO();
		demoVo.setName("zhangli");
		demoVo.setAge(26);
		demoVo.setId(4);
		DemoDao demoDao = aContext.getBean(DemoDao.class);
		demoDao.addDemo(demoVo);
	}
	
	@Test
	public void updateDemoTest(){
		Map map = new HashMap<String,Object>();
		map.put("id", 2);
		map.put("name", "lishang");
		map.put("age", 45);
		DemoDao demoDao = aContext.getBean(DemoDao.class);
		demoDao.updateDemo(map);
		
	}
	
}
