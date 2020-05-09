package com.txt.change_store.service;


import com.txt.change_store.pojo.Entity.StoreUser;

/**
 * 关于用户的业务操作
 */
public interface UserService {
    /**
     * 如果登陆成功返回true 否则false
     * @param user
     * @return
     */
    boolean login(StoreUser user);
}
