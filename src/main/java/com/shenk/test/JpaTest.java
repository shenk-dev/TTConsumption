package com.shenk.test;

import com.shenk.jpa.ILoginDao;
import com.shenk.jpa.IUserDao;
import com.shenk.jpa.IUserDetailDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jpa.xml"})
public class JpaTest {

    @Autowired
    IUserDao dao;

    @Autowired
    IUserDetailDao userDetailDao;

    @Autowired
    ILoginDao loginDao;

    @Test
    //@Transactional
    public void tes() {
        System.out.println(loginDao.findByUserNameAndPasswordAndDelFlag("a","a","0"));
    }
}
