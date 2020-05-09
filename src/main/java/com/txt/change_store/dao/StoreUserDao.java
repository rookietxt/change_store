package com.txt.change_store.dao;

import com.txt.change_store.pojo.Entity.StoreUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StoreUserDao {

    //根据主键删除
    int deleteByPrimaryKey(String userId);
  //插入数据
    int insert(StoreUser record);
//选择性插入
    int insertSelective(StoreUser record);
//根据主键查询
    StoreUser selectByPrimaryKey(String userId);
//根据主键选择性的更新
    int updateByPrimaryKeySelective(StoreUser record);
//更新全部
    int updateByPrimaryKey(StoreUser record);

    /**
     *根据用户的电话查询用户的级本信息
     * @param mobilePhone
     * @return
     */
     StoreUser selectBymobilePhone(String mobilePhone);
}