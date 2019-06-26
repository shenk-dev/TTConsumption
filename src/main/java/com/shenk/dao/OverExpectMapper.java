package com.shenk.dao;

import com.shenk.entity.OverExpect;

public interface OverExpectMapper {
    int deleteByPrimaryKey(String id);

    int insert(OverExpect record);

    int insertSelective(OverExpect record);

    OverExpect selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OverExpect record);

    int updateByPrimaryKey(OverExpect record);
}