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
@Table(name = "tbl_consumption_detail")
@Getter
@Setter
public class ConsumptionDetail extends BaseEntity {

    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "consumption_id")
    private String consumption_id;

    @Column(name = "consumption_date")
    private String date;

    @Column(name = "category")
    private String category;

    @Column(name = "consumption_val")
    private BigDecimal consumptionVal;
}
