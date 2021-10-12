package com.jc.entity;

import java.util.Date;

public class Village {
    private Integer id;
    private String regionRid;
    private String name;
    private String address;
    private Integer buildyear;
    private String buildtype;
    private String propertyCost;
    private String propCompany;
    private String consCompany;
    private Integer buildCount;
    private Integer houseCount;
    private String nearby;
    private Date logDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegionRid() {
        return regionRid;
    }

    public void setRegionRid(String regionRid) {
        this.regionRid = regionRid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBuildyear() {
        return buildyear;
    }

    public void setBuildyear(Integer buildyear) {
        this.buildyear = buildyear;
    }

    public String getBuildtype() {
        return buildtype;
    }

    public void setBuildtype(String buildtype) {
        this.buildtype = buildtype;
    }

    public String getPropertyCost() {
        return propertyCost;
    }

    public void setPropertyCost(String propertyCost) {
        this.propertyCost = propertyCost;
    }

    public String getPropCompany() {
        return propCompany;
    }

    public void setPropCompany(String propCompany) {
        this.propCompany = propCompany;
    }

    public String getConsCompany() {
        return consCompany;
    }

    public void setConsCompany(String consCompany) {
        this.consCompany = consCompany;
    }

    public Integer getBuildCount() {
        return buildCount;
    }

    public void setBuildCount(Integer buildCount) {
        this.buildCount = buildCount;
    }

    public Integer getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(Integer houseCount) {
        this.houseCount = houseCount;
    }

    public String getNearby() {
        return nearby;
    }

    public void setNearby(String nearby) {
        this.nearby = nearby;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    @Override
    public String toString() {
        return "Village{" +
                "id=" + id +
                ", regionRid='" + regionRid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", buildyear=" + buildyear +
                ", buildtype='" + buildtype + '\'' +
                ", propertyCost='" + propertyCost + '\'' +
                ", propCompany='" + propCompany + '\'' +
                ", consCompany='" + consCompany + '\'' +
                ", buildCount=" + buildCount +
                ", houseCount=" + houseCount +
                ", nearby='" + nearby + '\'' +
                ", logDate=" + logDate +
                '}';
    }
}
