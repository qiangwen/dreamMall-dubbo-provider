package com.mall.dubbo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DemoAspectAnnation {

	@Pointcut("execution(* com.mall.dubbo.provider.AopDemoService.method1(..))")
	public void method01cut(){}
	
	/**
	 * 方法一
	 */
	@Before("method01cut()")
	public void beforeMethod1(){
		
		System.out.println("beforeMethod01s");
	}
	
	/**
	 * 方法二
	 */
	@Before("execution(* com.mall.dubbo.provider.AopDemoService.method1(..))")
	public void beforeMethod2(){
		
		System.out.println("beforeMethod02");
	}
}
