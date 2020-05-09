package com.txt.change_store.pojo.Entity;

import java.io.Serializable;

/**
 * store_order_info
 * @author 
 */
public class StoreOrderInfo implements Serializable {
    /**
     * 订单详情id主键
     */
    private Integer orderInfoId;

    private String orderId;

    /**
     * 原来商品的链接
     */
    private Integer originGoodsId;

    /**
     * 下单时候商品价格
     */
    private Double goodsPrice;

    /**
     * 下单时候购买的数量
     */
    private String goodsBougtCount;

    private static final long serialVersionUID = 1L;

    public Integer getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Integer orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOriginGoodsId() {
        return originGoodsId;
    }

    public void setOriginGoodsId(Integer originGoodsId) {
        this.originGoodsId = originGoodsId;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsBougtCount() {
        return goodsBougtCount;
    }

    public void setGoodsBougtCount(String goodsBougtCount) {
        this.goodsBougtCount = goodsBougtCount;
    }
}