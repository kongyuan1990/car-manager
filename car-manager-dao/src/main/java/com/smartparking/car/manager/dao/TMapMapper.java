package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TMap;
import com.smartparking.car.manager.bean.TMapExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TMapMapper {
    long countByExample(TMapExample example);

    int deleteByExample(TMapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMap record);

    int insertSelective(TMap record);

    List<TMap> selectByExample(TMapExample example);

    TMap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMap record, @Param("example") TMapExample example);

    int updateByExample(@Param("record") TMap record, @Param("example") TMapExample example);

    int updateByPrimaryKeySelective(TMap record);

    int updateByPrimaryKey(TMap record);
    //----------------------------------------------------
    int updateMapAbsDistance(@Param("carportId")Integer carportId,@Param("absDistance")String absDistance);
    List<Map<String,Object>> selectDisplayData();
}