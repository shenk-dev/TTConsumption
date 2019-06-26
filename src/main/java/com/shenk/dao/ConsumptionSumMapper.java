package com.shenk.dao;

import com.shenk.entity.ConsumptionSum;

public interface ConsumptionSumMapper {
    int deleteByPrimaryKey(String id);

    int insert(ConsumptionSum record);

    int insertSelective(ConsumptionSum record);

    ConsumptionSum selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ConsumptionSum record);

    int updateByPrimaryKey(ConsumptionSum record);
}