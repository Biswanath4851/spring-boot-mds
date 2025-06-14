package com.summerof2025.mds.spring_boot_mds.productentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name= "orders")
public class Order {

    @Id
    private Integer orderId;
    private String orderFrom;
    private LocalDate orderDate;

    private Order(){

    }

    public Order(Integer orderId, String from, LocalDate date) {
        this.orderId = orderId;
        this.orderFrom = from;
        this.orderDate = date;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
