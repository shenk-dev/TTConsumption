package com.shenk.test;

import com.shenk.jpa.IUserDao;
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

    @Test
    public void tes() {
        //System.out.println(dao.findAll());
        System.out.println(dao.findAll());
    }
}
