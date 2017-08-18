package com.smartparking.car.manager.dao;

import com.smartparking.car.manager.bean.TWallet;
import com.smartparking.car.manager.bean.TWalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWalletMapper {
    long countByExample(TWalletExample example);

    int deleteByExample(TWalletExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWallet record);

    int insertSelective(TWallet record);

    List<TWallet> selectByExample(TWalletExample example);

    TWallet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWallet record, @Param("example") TWalletExample example);

    int updateByExample(@Param("record") TWallet record, @Param("example") TWalletExample example);

    int updateByPrimaryKeySelective(TWallet record);

    int updateByPrimaryKey(TWallet record);
    
    TWallet selectBy(String id);

	void updateByTuserMember(@Param("id")Integer id, @Param("money")Integer money);
	
	TWallet getWalletById(Integer id);
	
	int updateByAddBalance(@Param("money")Double money,@Param("wId")Integer wId);
	
	int updateByLesenBalance(@Param("money")Double money,@Param("wId")Integer wId);
}