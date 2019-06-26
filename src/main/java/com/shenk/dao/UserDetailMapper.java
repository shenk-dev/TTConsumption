package com.shenk.dao;

import com.shenk.entity.UserDetail;

public interface UserDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    UserDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKeyWithBLOBs(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
}