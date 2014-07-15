package com.mall.dubbo.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mall.dubbo.dao.TeacherDao;
import com.mall.dubbo.entity.Cource;
import com.mall.dubbo.entity.Student;
import com.mall.dubbo.entity.Teacher;

public class TeacherTest {

	ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-mybatis.xml");

	TeacherDao dao = context.getBean(TeacherDao.class);
	
	//@Test
	public void addTeacherTest(){
		
		Teacher t = new Teacher();
		
		t.setAge(45);
		t.setId(1);
		t.setSex(0);
		t.setTeacherName("liusanming");
		
		dao.addTeacher(t);
	}
	
	@Test
	public void getTeacherById(){
		
		Teacher t = dao.selectTeacerById(1);
		Cource c = t.getCource();
		List<Student> stus = t.getStudents();
		System.out.println(stus+","+stus.size());
		System.out.println(c);
		System.out.println(t);
	}
	//@Test
	public void getTeachers(){
		List<Teacher> ts = dao.selectAll();
		System.out.println(ts.size());
		Teacher t = ts.get(0);
		Cource c = t.getCource();
		List<Student> stus = t.getStudents();
		System.out.println(stus+","+stus.size());
		System.out.println(c);
		System.out.println(t);

	}
}
