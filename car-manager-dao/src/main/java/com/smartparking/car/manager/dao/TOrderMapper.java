package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TOrder;
import com.smartparking.car.manager.bean.TOrderExample;
import com.smartparking.car.manager.bean.TWallet;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TOrderMapper {
	long countByExample(TOrderExample example);

	int deleteByExample(TOrderExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(TOrder record);

	int insertSelective(TOrder record);

	List<TOrder> selectByExample(TOrderExample example);

	TOrder selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") TOrder record,
			@Param("example") TOrderExample example);

	int updateByExample(@Param("record") TOrder record,
			@Param("example") TOrderExample example);

	int updateByPrimaryKeySelective(TOrder record);

	int updateByPrimaryKey(TOrder record);

	List<TOrder> selectByName(Integer id);

	// 自定义方法，查询用户钱包
	TWallet selectMemberWalletByPrimaryKey(Integer id);

	// 自定义方法，查询商家钱包
	TWallet selectPortownerWalletByPrimaryKey(Integer id);
}