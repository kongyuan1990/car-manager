package com.smartparking.car.manager.bean;

public class TCertPortowner {
    private Integer id;

    private Integer certId;

    private Integer portownerId;

    private String iconpath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCertId() {
        return certId;
    }

    public void setCertId(Integer certId) {
        this.certId = certId;
    }

    public Integer getPortownerId() {
        return portownerId;
    }

    public void setPortownerId(Integer portownerId) {
        this.portownerId = portownerId;
    }

    public String getIconpath() {
        return iconpath;
    }

    public void setIconpath(String iconpath) {
        this.iconpath = iconpath == null ? null : iconpath.trim();
    }
}