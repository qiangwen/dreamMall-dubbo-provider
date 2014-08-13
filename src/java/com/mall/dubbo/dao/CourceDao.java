package com.mall.dubbo.dao;

import org.springframework.stereotype.Repository;

import com.mall.dubbo.entity.Cource;

@Repository
public interface CourceDao extends GenericDao {

	
	public abstract void addCource(Cource cource);
	
	public abstract Cource selectById(int id);
	
	public abstract void updateCourceById(Cource cource);
	
	public abstract void addCourecs();
	public abstract String selectName();
}
