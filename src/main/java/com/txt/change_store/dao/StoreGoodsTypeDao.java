package com.txt.change_store.dao;

import com.txt.change_store.pojo.Entity.StoreGoodsType;

public interface StoreGoodsTypeDao {
    int deleteByPrimaryKey(Integer goodsTypeId);

    int insert(StoreGoodsType record);

    int insertSelective(StoreGoodsType record);

    StoreGoodsType selectByPrimaryKey(Integer goodsTypeId);

    int updateByPrimaryKeySelective(StoreGoodsType record);

    int updateByPrimaryKey(StoreGoodsType record);
}