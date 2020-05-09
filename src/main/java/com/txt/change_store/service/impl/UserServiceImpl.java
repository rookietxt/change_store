package com.txt.change_store.service.impl;

import com.txt.change_store.dao.StoreUserDao;
import com.txt.change_store.pojo.Entity.StoreUser;
import com.txt.change_store.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service //交给springIOC（容器） 后边可以直接自动装配并使用
public class UserServiceImpl implements UserService {
    @Resource
    StoreUserDao StoreUserDao;
    @Override
    public boolean login(StoreUser user) {
        StoreUser dbUser = StoreUserDao.selectBymobilePhone(user.getMobilePhone());
        if(dbUser == null){//数据库没有该条手机的用户信息 登陆失败
            return false;
        }else{
            if(user.getUserPassword() == null)
                return false;
            if(user.getUserPassword().equals(dbUser.getUserPassword())) {//如果传输过来的密码等于查询的密码 就表登陆成功
                return true;
            }
        }
        return false;
    }
}
