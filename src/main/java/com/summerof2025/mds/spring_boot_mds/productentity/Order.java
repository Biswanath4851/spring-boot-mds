package com.summerof2025.mds.spring_boot_mds.productentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Order {

    @Id
    private Integer id;
    private String from;
    private LocalDate orderDate;

    private Order(){

    }

    public Order(Integer id, String from, LocalDate date) {
        this.id = id;
        this.from = from;
        this.orderDate = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
