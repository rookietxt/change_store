package com.txt.change_store.controller;

import com.txt.change_store.dao.StoreUserDao;
import com.txt.change_store.pojo.Entity.StoreUser;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class indexController {
    @Resource
    StoreUserDao StoreUserDao;
    @RequestMapping("/")

    public String index(){

        StoreUser user = StoreUserDao.selectByPrimaryKey("2016051609209");
       return "/pages/front/login/loginPage";
    }
}
