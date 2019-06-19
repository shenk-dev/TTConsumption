package com.shenk.common;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface BaseDao<T, K extends Serializable> extends CrudRepository<T, K> {
}
