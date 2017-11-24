package com.system.controller;

import com.system.po.Userlogin;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MvcControllerTest {

    private ApplicationContext applicationContext;

    @Before
    public void setup() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext("spring/springmvc.xml");
    }

    @Test
    public void findController() throws Exception{

        LoginController loginController = (LoginController)applicationContext.getBean("loginController");

        Userlogin userlogin = new Userlogin();

        userlogin.setPassword("123");
        userlogin.setRole(0);
        userlogin.setUsername("admin");
        userlogin.setUserid(1);

        String login = loginController.login(userlogin);

        System.out.println(login);
    }


}
