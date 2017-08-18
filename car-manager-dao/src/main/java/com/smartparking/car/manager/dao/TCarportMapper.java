package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TCarport;
import com.smartparking.car.manager.bean.TCarportExample;
import com.smartparking.car.manager.bean.TWallet;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TCarportMapper {
    long countByExample(TCarportExample example);

    int deleteByExample(TCarportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCarport record);

    int insertSelective(TCarport record);

    List<TCarport> selectByExample(TCarportExample example);

    TCarport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCarport record, @Param("example") TCarportExample example);

    int updateByExample(@Param("record") TCarport record, @Param("example") TCarportExample example);

    int updateByPrimaryKeySelective(TCarport record);

    int updateByPrimaryKey(TCarport record);
    
  //按价格排序停车场
    List<TCarport> getCarportByPrice();

    //按停车场名称查找停车场
    List<TCarport> getCarportByName(String name);
    
    List<TCarport> selectAllCarportsByMap();
    int selectRemainingPlaceNum(Integer id);

    TCarport getById(Integer id);
    
}