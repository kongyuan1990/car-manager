package com.smartparking.car.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.smartparking.car.manager.bean.TUserPortowner;
import com.smartparking.car.manager.bean.TUserPortownerExample;
import com.smartparking.car.manager.bean.TUserPortownerExample.Criteria;
import com.smartparking.car.manager.dao.TUserPortownerMapper;
import com.smartparking.car.manager.service.PortOwnerService;

@Service
public class PortOwnerServiceImpl implements PortOwnerService {

	@Autowired
	TUserPortownerMapper mapper;
	
	@Override
	public List<TUserPortowner> getunAuthPorts(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		TUserPortownerExample example = new TUserPortownerExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(0);
		PageHelper.startPage(pageNum, pageSize);
		return mapper.selectByExample(example);
	}

	@Override
	public List<TUserPortowner> getAuthPorts(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		TUserPortownerExample example = new TUserPortownerExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(1);
		PageHelper.startPage(pageNum, pageSize);
		return mapper.selectByExample(example);
	}

	@Override
	public List<TUserPortowner> getfailedAuthPorts(Integer pageNum,
			Integer pageSize) {
		// TODO Auto-generated method stub
		TUserPortownerExample example = new TUserPortownerExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(2);
		PageHelper.startPage(pageNum, pageSize);
		return mapper.selectByExample(example);
	}

	@Override
	public void portFail(Integer id) {
		// TODO Auto-generated method stub
		TUserPortowner record = new TUserPortowner();
		record.setStatus(2);
		record.setId(id);
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void portSuccess(Integer id) {
		// TODO Auto-generated method stub
		TUserPortowner record = new TUserPortowner();
		record.setStatus(1);
		record.setId(id);
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deletePort(Integer id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

}
