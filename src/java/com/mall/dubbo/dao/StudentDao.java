package com.mall.dubbo.dao;

import com.mall.dubbo.entity.Student;

public interface StudentDao extends GenericDao {

	public abstract void addStudent(Student student);
}
