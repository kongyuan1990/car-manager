package com.smartparking.car.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartparking.car.manager.bean.TCarport;
import com.smartparking.car.manager.bean.TCarportExample;
import com.smartparking.car.manager.bean.TCarportExample.Criteria;
import com.smartparking.car.manager.dao.TCarportMapper;
import com.smartparking.car.manager.service.PortService;

@Service
public class PortServiceImpl implements PortService {

	@Autowired
	TCarportMapper carportMapper;
	
	@Override
	public TCarport getPortByPortowenerId(Integer portownerId) {
		// TODO Auto-generated method stub
		TCarportExample example = new TCarportExample();
		Criteria criteria = example.createCriteria();
		criteria.andPortownerIdEqualTo(portownerId);
		List<TCarport> list = carportMapper.selectByExample(example);
		return list.size()==1?list.get(0):null;
	}

}
