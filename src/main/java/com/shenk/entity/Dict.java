package com.shenk.entity;

import com.shenk.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_dict")
@Getter
@Setter
public class Dict extends BaseEntity {

    @Id
    private String id;

    @Column(name = "pro_category")
    private String category;

    @Column(name = "key")
    private String key;

    @Column(name = "val")
    private String value;
}
