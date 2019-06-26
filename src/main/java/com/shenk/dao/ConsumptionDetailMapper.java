package com.shenk.dao;

import com.shenk.entity.ConsumptionDetail;

public interface ConsumptionDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(ConsumptionDetail record);

    int insertSelective(ConsumptionDetail record);

    ConsumptionDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ConsumptionDetail record);

    int updateByPrimaryKey(ConsumptionDetail record);
}