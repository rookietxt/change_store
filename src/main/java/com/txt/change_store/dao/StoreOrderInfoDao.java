package com.txt.change_store.dao;

import com.txt.change_store.pojo.Entity.StoreOrderInfo;

public interface StoreOrderInfoDao {
    int deleteByPrimaryKey(Integer orderInfoId);

    int insert(StoreOrderInfo record);

    int insertSelective(StoreOrderInfo record);

    StoreOrderInfo selectByPrimaryKey(Integer orderInfoId);

    int updateByPrimaryKeySelective(StoreOrderInfo record);

    int updateByPrimaryKey(StoreOrderInfo record);
}