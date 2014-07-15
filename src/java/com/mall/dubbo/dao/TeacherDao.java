package com.mall.dubbo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mall.dubbo.entity.Teacher;

@Repository
public interface TeacherDao extends GenericDao{

	public abstract void addTeacher(Teacher teacher);
	
	public abstract Teacher selectTeacerById(int id);
	
	public abstract List<Teacher> selectAll();
	
}
