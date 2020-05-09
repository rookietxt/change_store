package com.txt.change_store.dao;

import com.txt.change_store.pojo.Entity.StoreGoods;

public interface StoreGoodsDao {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(StoreGoods record);

    int insertSelective(StoreGoods record);

    StoreGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(StoreGoods record);

    int updateByPrimaryKey(StoreGoods record);
}