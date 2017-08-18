package com.smartparking.car.manager.service;

import com.smartparking.car.manager.bean.TCarport;

public interface PortService {

	/**
	 * 根据拥有者id查找 车库对象
	 * @return
	 */
	TCarport getPortByPortowenerId(Integer portownerId);

}
