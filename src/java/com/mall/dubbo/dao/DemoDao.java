package com.mall.dubbo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mall.dubbo.entity.DemoVO;

@Repository
public interface DemoDao extends GenericDao{

	public abstract List<DemoVO> selectAll();
	
	public abstract void deleteById(int id);
	
	public abstract void addDemo(DemoVO demoVo);
	
	public abstract void updateDemo(Map map);
}
