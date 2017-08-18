package com.smartparking.car.manager.service;

import java.util.List;

import com.smartparking.car.manager.bean.TUserMember;

public interface KUserService {

	/**
	 * 获取未认证用户
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<TUserMember> getunAuthUsers(Integer pageNum,Integer pageSize);
	
	/**
	 * 获取已认证用户
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<TUserMember> getAuthUsers(Integer pageNum,Integer pageSize);
	
	/**
	 * 获取认证失败用户
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<TUserMember> getfailedAuthUsers(Integer pageNum,Integer pageSize);

	/**
	 * 认证成功，车主状态改为1
	 * @param id
	 */
	void authSuccess(Integer id);

	/**
	 * 认证成功，车主状态改为2
	 * @param id
	 */
	void authFail(Integer id);

	/**
	 * 删除车主
	 * @param id
	 */
	void deleteUser(Integer id);

	TUserMember searchUserByid(Integer id);

	TUserMember searchUserByName(String name);

	TUserMember searchUserByPhoneNumber(String phoneNumber);

	/**
	 * 数据库中，排在车主前面的人数
	 * @param member
	 * @return
	 */
	long getCountBeforeMember(TUserMember member);
}
