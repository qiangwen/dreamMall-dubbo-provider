package com.mall.dubbo.provider;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mall.dubbo.entity.Cource;
import com.mall.dubbo.entity.Student;
import com.mall.dubbo.entity.Teacher;

@Transactional(readOnly=true)
public class TransactionDemoService {

	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
	public Cource getById(){
	
		return null;
	}
	
	@Transactional(readOnly=true,isolation=Isolation.READ_COMMITTED)
	public void updateStudent(Student student){
		
	}
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public boolean insertTeacher(Teacher t){
		
		return false;
	}
	
}
