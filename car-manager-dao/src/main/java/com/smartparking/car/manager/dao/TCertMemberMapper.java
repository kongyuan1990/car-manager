package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TCertMember;
import com.smartparking.car.manager.bean.TCertMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCertMemberMapper {
    long countByExample(TCertMemberExample example);

    int deleteByExample(TCertMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCertMember record);

    int insertSelective(TCertMember record);

    List<TCertMember> selectByExample(TCertMemberExample example);

    TCertMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCertMember record, @Param("example") TCertMemberExample example);

    int updateByExample(@Param("record") TCertMember record, @Param("example") TCertMemberExample example);

    int updateByPrimaryKeySelective(TCertMember record);

    int updateByPrimaryKey(TCertMember record);
    
    void insertBatch(@Param("certs")List<TCertMember> certsList);
}