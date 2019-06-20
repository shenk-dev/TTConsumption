package com.shenk.jpa;

import com.shenk.entity.UserDetail;
import org.springframework.data.repository.CrudRepository;

public interface IUserDetailDao extends CrudRepository<UserDetail, String> {
}
