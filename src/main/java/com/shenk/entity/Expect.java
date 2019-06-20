package com.shenk.entity;

import com.shenk.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_expect")
@Getter
@Setter
public class Expect extends BaseEntity {

    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "expect_day")
    private BigDecimal expectDay;

    @Column(name = "expect_month")
    private BigDecimal expectMonth;

    @Column(name = "version")
    private String version;
}
