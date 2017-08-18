package com.smartparking.car.manager.service;

import java.util.List;

import com.smartparking.car.manager.bean.TUserPortowner;

public interface PortOwnerService {

	List<TUserPortowner> getunAuthPorts(Integer pageNum, Integer pageSize);

	List<TUserPortowner> getAuthPorts(Integer pageNum, Integer pageSize);

	List<TUserPortowner> getfailedAuthPorts(Integer pageNum, Integer pageSize);

	void portFail(Integer id);

	void portSuccess(Integer id);

	void deletePort(Integer id);

}
