package com.txt.change_store.pojo.Entity;

import java.io.Serializable;

/**
 * store_order
 * @author 
 */
public class StoreOrder implements Serializable {
    /**
     * 订单id
     */
    private String orderId;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}