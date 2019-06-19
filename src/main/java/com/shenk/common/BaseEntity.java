package com.shenk.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
public class BaseEntity {

    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name ="update_by")
    private String updateBy;
}
