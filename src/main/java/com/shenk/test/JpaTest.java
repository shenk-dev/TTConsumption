package com.shenk.test;

import com.shenk.entity.UserDetail;
import com.shenk.jpa.IUserDao;
import com.shenk.jpa.IUserDetailDao;
import org.hibernate.Hibernate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileInputStream;
import java.io.InputStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jpa.xml"})
public class JpaTest {

    @Autowired
    IUserDao dao;

    @Autowired
    IUserDetailDao userDetailDao;

    @Test
    //@Transactional
    public void tes() {

        UserDetail userDetail =new UserDetail();
        userDetail.setId("asad");
        userDetail.setUserId("a");
        userDetail.setSex("1");
        try {
            InputStream in = new FileInputStream("D://yd.jpg");
            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            userDetail.setImg(bytes);
            userDetailDao.save(userDetail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
