package com.shenk.jpa;

import com.shenk.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface ILoginDao extends CrudRepository<User, String> {

    Long countByUserNameAndDelFlag(String userName, String delFlag);

    User findByUserNameAndPasswordAndDelFlag(String userName, String password, String delFlag);
}
