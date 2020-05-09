package com.txt.change_store.dao;

import com.txt.change_store.pojo.Entity.StoreTrolley;

public interface StoreTrolleyDao {
    int deleteByPrimaryKey(Integer trolleyId);

    int insert(StoreTrolley record);

    int insertSelective(StoreTrolley record);

    StoreTrolley selectByPrimaryKey(Integer trolleyId);

    int updateByPrimaryKeySelective(StoreTrolley record);

    int updateByPrimaryKey(StoreTrolley record);
}