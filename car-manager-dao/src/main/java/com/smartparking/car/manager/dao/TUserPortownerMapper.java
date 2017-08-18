package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TUserPortowner;
import com.smartparking.car.manager.bean.TUserPortownerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserPortownerMapper {
    long countByExample(TUserPortownerExample example);

    int deleteByExample(TUserPortownerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserPortowner record);

    int insertSelective(TUserPortowner record);

    List<TUserPortowner> selectByExample(TUserPortownerExample example);

    TUserPortowner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserPortowner record, @Param("example") TUserPortownerExample example);

    int updateByExample(@Param("record") TUserPortowner record, @Param("example") TUserPortownerExample example);

    int updateByPrimaryKeySelective(TUserPortowner record);

    int updateByPrimaryKey(TUserPortowner record);
}