package com.shenk.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Consumption {
    private String id;

    private String userId;

    private String consumptionDate;

    private BigDecimal breakfast;

    private BigDecimal lunch;

    private BigDecimal dinner;

    private BigDecimal midNightSnack;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getConsumptionDate() {
        return consumptionDate;
    }

    public void setConsumptionDate(String consumptionDate) {
        this.consumptionDate = consumptionDate == null ? null : consumptionDate.trim();
    }

    public BigDecimal getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(BigDecimal breakfast) {
        this.breakfast = breakfast;
    }

    public BigDecimal getLunch() {
        return lunch;
    }

    public void setLunch(BigDecimal lunch) {
        this.lunch = lunch;
    }

    public BigDecimal getDinner() {
        return dinner;
    }

    public void setDinner(BigDecimal dinner) {
        this.dinner = dinner;
    }

    public BigDecimal getMidNightSnack() {
        return midNightSnack;
    }

    public void setMidNightSnack(BigDecimal midNightSnack) {
        this.midNightSnack = midNightSnack;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}