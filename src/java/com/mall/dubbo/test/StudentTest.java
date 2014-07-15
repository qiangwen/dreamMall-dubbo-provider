package com.mall.dubbo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mall.dubbo.dao.StudentDao;
import com.mall.dubbo.entity.Student;

public class StudentTest {

	ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-mybatis.xml");
	
	StudentDao dao = context.getBean(StudentDao.class);
	
	@Test
	public void addStudentTest(){
		
		Student stu = new Student();
		stu.setAge(21);
		stu.setId(3);
		stu.setSex(1);
		stu.setStudentName("zhangqi");
		stu.setTeacherId(1);
		
		dao.addStudent(stu);
	}
}
