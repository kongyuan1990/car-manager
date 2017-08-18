package com.smartparking.car.manager.bean;

public class TWallet {
    private Integer id;

    private Double balance;

    private Integer type;

    private Double guaranty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(Double guaranty) {
        this.guaranty = guaranty;
    }
}