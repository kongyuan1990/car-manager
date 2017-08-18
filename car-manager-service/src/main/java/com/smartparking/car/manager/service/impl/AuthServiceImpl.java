package com.smartparking.car.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.smartparking.car.manager.bean.TAuth;
import com.smartparking.car.manager.bean.TAuthExample;
import com.smartparking.car.manager.bean.TAuthExample.Criteria;
import com.smartparking.car.manager.dao.TAuthMapper;
import com.smartparking.car.manager.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	TAuthMapper authMapper;

	@Override
	public TAuth loginAuth(TAuth auth) {
		// TODO Auto-generated method stub
		if (auth == null)
			return null;
		TAuthExample example = new TAuthExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(auth.getName());
		criteria.andPasswordEqualTo(auth.getPassword());
		List<TAuth> list = authMapper.selectByExample(example);
		if(list.size() == 1)
			return list.get(0);
		return null;
	}

	@Override
	public void update(TAuth loginAuth) {
		// TODO Auto-generated method stub
		authMapper.updateByPrimaryKeySelective(loginAuth);
	}

	@Override
	public List<TAuth> getAuths(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNo, pageSize);
		return getAllAuths();
	}

	@Override
	public List<TAuth> getAllAuths() {
		// TODO Auto-generated method stub
		return authMapper.selectByExample(null);
	}

	@Override
	public void addAuth(TAuth auth) {
		auth.setPassword("123456");
		// TODO Auto-generated method stub
		authMapper.insertSelective(auth);
	}

	@Override
	public void deleteAuth(Integer id) {
		// TODO Auto-generated method stub
		authMapper.deleteByPrimaryKey(id);
	}

	@Override
	public TAuth updateAuthSelf(TAuth auth) {
		// TODO Auto-generated method stub
		authMapper.updateByPrimaryKeySelective(auth);
		return authMapper.selectByPrimaryKey(auth.getId());
	}

	@Override
	public TAuth getAuthById(int parseInt) {
		// TODO Auto-generated method stub
		return authMapper.selectByPrimaryKey(parseInt);
	}

	@Override
	public TAuth getAuthByName(String name) {
		// TODO Auto-generated method stub
		TAuthExample example = new TAuthExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		List<TAuth> list = authMapper.selectByExample(example);
		return list.size()==1?list.get(0):null;
	}

	@Override
	public TAuth getAuthByEmail(String email) {
		// TODO Auto-generated method stub
		TAuthExample example = new TAuthExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		List<TAuth> list = authMapper.selectByExample(example);
		return list.size()==1?list.get(0):null;
	}

	@Override
	public TAuth getAuthByPhone(String phone) {
		// TODO Auto-generated method stub
		TAuthExample example = new TAuthExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(phone);
		List<TAuth> list = authMapper.selectByExample(example);
		return list.size()==1?list.get(0):null;
	}

	@Override
	public long getAuthCount(TAuth auth) {
		// TODO Auto-generated method stub
		TAuthExample example = new TAuthExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdLessThan(auth.getId());
		long byExample = authMapper.countByExample(example);
		return byExample;
	}


}
