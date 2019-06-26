package com.shenk.dao;

import com.shenk.entity.Expect;

public interface ExpectMapper {
    int deleteByPrimaryKey(String id);

    int insert(Expect record);

    int insertSelective(Expect record);

    Expect selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Expect record);

    int updateByPrimaryKey(Expect record);
}