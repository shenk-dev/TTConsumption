package com.shenk.jpa;

import com.shenk.common.BaseDao;
import com.shenk.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends BaseDao<User, String> {

    Long countByUserNameAndDelFlag(String userName, String delFlag);

    User findByUserNameAndPasswordAndDelFlag(String userName, String password, String delFlag);
}
