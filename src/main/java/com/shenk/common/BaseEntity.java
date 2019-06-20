package com.shenk.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Column(name = "del_flag",insertable = false)
    private String delFlag;

    @Column(name = "create_time", insertable = false)
    private Date createTime;

    @Column(name = "create_by", insertable = false)
    private String createBy;

    @Column(name = "update_time", insertable = false)
    private Date updateTime;

    @Column(name ="update_by", insertable = false)
    private String updateBy;
}
