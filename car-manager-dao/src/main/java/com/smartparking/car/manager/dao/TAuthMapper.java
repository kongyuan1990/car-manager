package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TAuth;
import com.smartparking.car.manager.bean.TAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthMapper {
    long countByExample(TAuthExample example);

    int deleteByExample(TAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAuth record);

    int insertSelective(TAuth record);

    List<TAuth> selectByExample(TAuthExample example);

    TAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAuth record, @Param("example") TAuthExample example);

    int updateByExample(@Param("record") TAuth record, @Param("example") TAuthExample example);

    int updateByPrimaryKeySelective(TAuth record);

    int updateByPrimaryKey(TAuth record);
}