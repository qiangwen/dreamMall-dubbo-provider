package com.mall.dubbo.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.mall.dubbo.dao.DemoDao;
import com.mall.dubbo.entity.DemoVO;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao demoDao;
	/**
	 * demo service
	 */
	@Override
	public String sayMsg(String msg) {
		List<DemoVO> list = demoDao.selectAll();
		StringBuffer sb = new StringBuffer();
		sb.append("hello,welcome to beijing!");
		sb.append("nice to meet you,wenqiang!");
		sb.append(msg);
		sb.append(list.get(0).getName()+list.get(0).getAge());
		return sb.toString();
	}

	
	
}
