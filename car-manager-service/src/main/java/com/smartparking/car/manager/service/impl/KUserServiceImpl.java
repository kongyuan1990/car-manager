package com.smartparking.car.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.smartparking.car.manager.bean.TUserMember;
import com.smartparking.car.manager.bean.TUserMemberExample;
import com.smartparking.car.manager.bean.TUserMemberExample.Criteria;
import com.smartparking.car.manager.dao.TUserMemberMapper;
import com.smartparking.car.manager.service.KUserService;

@Service
public class KUserServiceImpl implements KUserService {

	@Autowired
	TUserMemberMapper mapper;
	
	@Override
	public List<TUserMember> getunAuthUsers(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		TUserMemberExample example = new TUserMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(0);
		PageHelper.startPage(pageNum, pageSize);
		return mapper.selectByExample(example);
	}

	@Override
	public List<TUserMember> getAuthUsers(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		TUserMemberExample example = new TUserMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(1);
		PageHelper.startPage(pageNum, pageSize);
		return mapper.selectByExample(example);
	}

	@Override
	public List<TUserMember> getfailedAuthUsers(Integer pageNum,
			Integer pageSize) {
		// TODO Auto-generated method stub
		TUserMemberExample example = new TUserMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(2);
		PageHelper.startPage(pageNum, pageSize);
		return mapper.selectByExample(example);
	}

	@Override
	public void authSuccess(Integer id) {
		// TODO Auto-generated method stub
		TUserMember record = new TUserMember();
		record.setId(id);
		record.setStatus(1);
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void authFail(Integer id) {
		// TODO Auto-generated method stub
		TUserMember record = new TUserMember();
		record.setId(id);
		record.setStatus(2);
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public TUserMember searchUserByid(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public TUserMember searchUserByName(String name) {
		// TODO Auto-generated method stub
		TUserMemberExample example = new TUserMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		List<TUserMember> list = mapper.selectByExample(example);
		return list.size()==1?list.get(0):null;
	}

	@Override
	public TUserMember searchUserByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		TUserMemberExample example = new TUserMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(phoneNumber);
		List<TUserMember> list = mapper.selectByExample(example);
		return list.size()==1?list.get(0):null;
	}

	@Override
	public long getCountBeforeMember(TUserMember member) {
		// TODO Auto-generated method stub
		TUserMemberExample example = new TUserMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(member.getStatus());
		criteria.andIdLessThan(member.getId());
		return mapper.countByExample(example);
	}

}
