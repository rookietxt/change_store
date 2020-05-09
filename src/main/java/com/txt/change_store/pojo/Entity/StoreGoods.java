package com.txt.change_store.pojo.Entity;

import java.io.Serializable;

/**
 * store_goods
 * @author 
 */
public class StoreGoods implements Serializable {
    /**
     * 商品的id主键
     */
    private Integer goodsId;

    /**
     * 商品类型id
     */
    private Integer goodsTypeId;

    /**
     * 商品标题
     */
    private String goodsTitle;

    /**
     * 商品的图片路径
     */
    private String goodsImg;

    /**
     * 商品原价
     */
    private Double goodsOldPrice;

    /**
     * 商品实际上架价格
     */
    private Double goodsPrice;

    /**
     * 商品描述文本详情
     */
    private Integer goodsContent;

    /**
     * 商品库存
     */
    private Integer goodsCounts;

    /**
     * 商品是否在售
     */
    private Integer goodsOnsaleFlag;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Double getGoodsOldPrice() {
        return goodsOldPrice;
    }

    public void setGoodsOldPrice(Double goodsOldPrice) {
        this.goodsOldPrice = goodsOldPrice;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(Integer goodsContent) {
        this.goodsContent = goodsContent;
    }

    public Integer getGoodsCounts() {
        return goodsCounts;
    }

    public void setGoodsCounts(Integer goodsCounts) {
        this.goodsCounts = goodsCounts;
    }

    public Integer getGoodsOnsaleFlag() {
        return goodsOnsaleFlag;
    }

    public void setGoodsOnsaleFlag(Integer goodsOnsaleFlag) {
        this.goodsOnsaleFlag = goodsOnsaleFlag;
    }
}