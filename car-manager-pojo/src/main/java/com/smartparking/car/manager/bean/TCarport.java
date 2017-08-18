package com.smartparking.car.manager.bean;

import java.util.Date;

public class TCarport {
    private Integer id;

    private String name;

    private String address;

    private String picturepath;

    private Integer totalPlace;

    private Integer remainingPlace;

    private Double price;

    private Date reservetime;

    private Double dayPrice;

    private Double monthPrice;

    private String addressCity;

    private Integer portownerId;

    private Double hourPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath == null ? null : picturepath.trim();
    }

    public Integer getTotalPlace() {
        return totalPlace;
    }

    public void setTotalPlace(Integer totalPlace) {
        this.totalPlace = totalPlace;
    }

    public Integer getRemainingPlace() {
        return remainingPlace;
    }

    public void setRemainingPlace(Integer remainingPlace) {
        this.remainingPlace = remainingPlace;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getReservetime() {
        return reservetime;
    }

    public void setReservetime(Date reservetime) {
        this.reservetime = reservetime;
    }

    public Double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(Double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public Double getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(Double monthPrice) {
        this.monthPrice = monthPrice;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity == null ? null : addressCity.trim();
    }

    public Integer getPortownerId() {
        return portownerId;
    }

    public void setPortownerId(Integer portownerId) {
        this.portownerId = portownerId;
    }

    public Double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(Double hourPrice) {
        this.hourPrice = hourPrice;
    }
}