package com.txt.change_store.pojo.Entity;

import java.io.Serializable;

/**
 * store_trolley
 * @author 
 */
public class StoreTrolley implements Serializable {
    /**
     * 购物车id
     */
    private Integer trolleyId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 购买数量
     */
    private Integer goodsBougtCount;

    private static final long serialVersionUID = 1L;

    public Integer getTrolleyId() {
        return trolleyId;
    }

    public void setTrolleyId(Integer trolleyId) {
        this.trolleyId = trolleyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsBougtCount() {
        return goodsBougtCount;
    }

    public void setGoodsBougtCount(Integer goodsBougtCount) {
        this.goodsBougtCount = goodsBougtCount;
    }
}