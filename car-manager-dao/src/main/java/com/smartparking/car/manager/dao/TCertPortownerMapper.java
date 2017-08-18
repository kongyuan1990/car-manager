package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TCertPortowner;
import com.smartparking.car.manager.bean.TCertPortownerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCertPortownerMapper {
    long countByExample(TCertPortownerExample example);

    int deleteByExample(TCertPortownerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCertPortowner record);

    int insertSelective(TCertPortowner record);

    List<TCertPortowner> selectByExample(TCertPortownerExample example);

    TCertPortowner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCertPortowner record, @Param("example") TCertPortownerExample example);

    int updateByExample(@Param("record") TCertPortowner record, @Param("example") TCertPortownerExample example);

    int updateByPrimaryKeySelective(TCertPortowner record);

    int updateByPrimaryKey(TCertPortowner record);
    
    void insertBatch(@Param("certs")List<TCertPortowner> certsList);
}