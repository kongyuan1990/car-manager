package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TUserMember;
import com.smartparking.car.manager.bean.TUserMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMemberMapper {
    long countByExample(TUserMemberExample example);

    int deleteByExample(TUserMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserMember record);

    int insertSelective(TUserMember record);

    List<TUserMember> selectByExample(TUserMemberExample example);

    TUserMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserMember record, @Param("example") TUserMemberExample example);

    int updateByExample(@Param("record") TUserMember record, @Param("example") TUserMemberExample example);

    int updateByPrimaryKeySelective(TUserMember record);

    int updateByPrimaryKey(TUserMember record);
    
    void updatebyname(@Param("iconpath")String iconpath, @Param("id")Integer id);

	String selectByName(Integer id);
}