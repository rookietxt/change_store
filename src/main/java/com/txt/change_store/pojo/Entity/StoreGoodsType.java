package com.txt.change_store.pojo.Entity;

import java.io.Serializable;

/**
 * store_goods_type
 * @author 
 */
public class StoreGoodsType implements Serializable {
    /**
     * 商品类型id主键
     */
    private Integer goodsTypeId;

    /**
     * 商品父类型id
     */
    private Integer goodsParentType;

    /**
     * 商品父类型名称
     */
    private String goodsParentName;

    /**
     * 类型的序号，根据序号排序优先展示
     */
    private Integer goodsTypeSort;

    /**
     * 类型图标样式路径
     */
    private String goodsTypeIcon;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getGoodsParentType() {
        return goodsParentType;
    }

    public void setGoodsParentType(Integer goodsParentType) {
        this.goodsParentType = goodsParentType;
    }

    public String getGoodsParentName() {
        return goodsParentName;
    }

    public void setGoodsParentName(String goodsParentName) {
        this.goodsParentName = goodsParentName;
    }

    public Integer getGoodsTypeSort() {
        return goodsTypeSort;
    }

    public void setGoodsTypeSort(Integer goodsTypeSort) {
        this.goodsTypeSort = goodsTypeSort;
    }

    public String getGoodsTypeIcon() {
        return goodsTypeIcon;
    }

    public void setGoodsTypeIcon(String goodsTypeIcon) {
        this.goodsTypeIcon = goodsTypeIcon;
    }
}