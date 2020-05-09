package com.txt.change_store.dao;

import com.txt.change_store.pojo.Entity.StoreOrder;

public interface StoreOrderDao {
    int deleteByPrimaryKey(String orderId);

    int insert(StoreOrder record);

    int insertSelective(StoreOrder record);
}