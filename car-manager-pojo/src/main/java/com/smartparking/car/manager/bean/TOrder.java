package com.smartparking.car.manager.bean;

import java.util.Date;

public class TOrder {
    private Integer id;

    private Integer preorderId;

    private Double totalPrice;

    private Integer portownerId;

    private Date createtime;

    private Date parkingTime;

    private Date leavingTime;

    private Date totalTime;

    private Double price;

    private Integer memberId;

    private String carportName;

    private Integer status;

    private Integer cartportId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPreorderId() {
        return preorderId;
    }

    public void setPreorderId(Integer preorderId) {
        this.preorderId = preorderId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getPortownerId() {
        return portownerId;
    }

    public void setPortownerId(Integer portownerId) {
        this.portownerId = portownerId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(Date parkingTime) {
        this.parkingTime = parkingTime;
    }

    public Date getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(Date leavingTime) {
        this.leavingTime = leavingTime;
    }

    public Date getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Date totalTime) {
        this.totalTime = totalTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getCarportName() {
        return carportName;
    }

    public void setCarportName(String carportName) {
        this.carportName = carportName == null ? null : carportName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCartportId() {
        return cartportId;
    }

    public void setCartportId(Integer cartportId) {
        this.cartportId = cartportId;
    }
}