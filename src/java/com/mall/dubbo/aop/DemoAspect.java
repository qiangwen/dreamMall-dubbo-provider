package com.mall.dubbo.aop;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

public class DemoAspect implements PlatformTransactionManager{

	public void beforeMethod(){
		
		System.out.println("beforeMethod");
	}
	
	public void afterMethod(){
		System.out.println("afterMethod");
	}

	@Override
	public void commit(TransactionStatus arg0) throws TransactionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TransactionStatus getTransaction(TransactionDefinition arg0)
			throws TransactionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rollback(TransactionStatus arg0) throws TransactionException {
		// TODO Auto-generated method stub
		
	}
}
