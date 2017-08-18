package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TPreorder;
import com.smartparking.car.manager.bean.TPreorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPreorderMapper {
    long countByExample(TPreorderExample example);

    int deleteByExample(TPreorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPreorder record);

    int insertSelective(TPreorder record);

    List<TPreorder> selectByExample(TPreorderExample example);

    TPreorder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPreorder record, @Param("example") TPreorderExample example);

    int updateByExample(@Param("record") TPreorder record, @Param("example") TPreorderExample example);

    int updateByPrimaryKeySelective(TPreorder record);

    int updateByPrimaryKey(TPreorder record);
}