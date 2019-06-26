package com.shenk.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Expect {
    private String id;

    private String userId;

    private BigDecimal expectDay;

    private BigDecimal expectMonth;

    private Integer version;

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

    public BigDecimal getExpectDay() {
        return expectDay;
    }

    public void setExpectDay(BigDecimal expectDay) {
        this.expectDay = expectDay;
    }

    public BigDecimal getExpectMonth() {
        return expectMonth;
    }

    public void setExpectMonth(BigDecimal expectMonth) {
        this.expectMonth = expectMonth;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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