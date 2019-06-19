package com.shenk.entity;

import com.shenk.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tbl_user")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    private String id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;


}
