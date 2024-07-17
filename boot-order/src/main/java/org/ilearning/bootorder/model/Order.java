package org.ilearning.bootorder.model;

/**
 * 功能注释
 *
 * @author 2024-07-17
 */
public class Order {
    /**
     * orderId
     */
    private int orderId;

    /**
     * orderName
     */
    private String orderName;

    /**
     * 消费者id
     */
    private int customerId;

    /**
     * 质量等级
     */
    private String quantityLevel;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getQuantityLevel() {
        return quantityLevel;
    }

    public void setQuantityLevel(String quantityLevel) {
        this.quantityLevel = quantityLevel;
    }
}
