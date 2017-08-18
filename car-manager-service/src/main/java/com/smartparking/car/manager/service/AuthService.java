package com.smartparking.car.manager.service;

import java.util.List;
import java.util.Map;

import com.smartparking.car.manager.bean.TAuth;

public interface AuthService {
	/**
	 * 用户登陆，判断用户是否存在
	 * @param auth
	 * @return
	 */
	TAuth loginAuth(TAuth auth);
	
	/**
	 * 更新用户信息
	 * @param loginAuth
	 */
	void update(TAuth loginAuth);

	/**
	 * 获得分页用户信息
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	List<TAuth> getAuths(int pageNo,int pageSize);
	
	/**
	 * 获得总用户信息
	 * @return
	 */
	List<TAuth> getAllAuths();

	/**
	 * 增加一个员工，密码初始化为123456
	 * @param auth
	 */
	void addAuth(TAuth auth);
	
	/**
	 * 删除一个员工
	 * @param auth
	 */
	void deleteAuth(Integer id);

	/**
	 * 用户更改个人资料
	 * @param auth
	 * @return
	 */
	TAuth updateAuthSelf(TAuth auth);

	TAuth getAuthById(int parseInt);

	TAuth getAuthByName(String name);

	TAuth getAuthByEmail(String email);

	TAuth getAuthByPhone(String phone);

	long getAuthCount(TAuth auth);
}
