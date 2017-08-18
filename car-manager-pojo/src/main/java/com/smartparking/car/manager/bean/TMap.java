package com.smartparking.car.manager.bean;

public class TMap {
    private Integer id;

    private String currentPoint;

    private String searchPoint;

    private String absDistance;

    private String relatDistance;

    private String longitude;

    private String latitude;

    private Integer carportId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(String currentPoint) {
        this.currentPoint = currentPoint == null ? null : currentPoint.trim();
    }

    public String getSearchPoint() {
        return searchPoint;
    }

    public void setSearchPoint(String searchPoint) {
        this.searchPoint = searchPoint == null ? null : searchPoint.trim();
    }

    public String getAbsDistance() {
        return absDistance;
    }

    public void setAbsDistance(String absDistance) {
        this.absDistance = absDistance == null ? null : absDistance.trim();
    }

    public String getRelatDistance() {
        return relatDistance;
    }

    public void setRelatDistance(String relatDistance) {
        this.relatDistance = relatDistance == null ? null : relatDistance.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Integer getCarportId() {
        return carportId;
    }

    public void setCarportId(Integer carportId) {
        this.carportId = carportId;
    }
}