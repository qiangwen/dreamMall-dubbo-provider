package com.mall.dubbo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mall.dubbo.provider.AopDemoService;

public class AopTest {

	ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-app.xml");
	AopDemoService service = (AopDemoService) context.getBean("aopDemoService");
	
	@Test
	public void method01Test(){
		
		String str = service.method1();
		System.out.println("test----->"+str);
	}
	
	//@Test
	public void method02Test(){
		String str = service.method2();
		System.out.println("test---->"+str);
	}
}
