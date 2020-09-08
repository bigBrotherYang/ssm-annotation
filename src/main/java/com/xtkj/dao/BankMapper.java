package com.xtkj.dao;

import com.xtkj.pojo.Bank;

public interface BankMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Bank record);

    int insertSelective(Bank record);

    Bank selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Bank record);

    int updateByPrimaryKey(Bank record);
}