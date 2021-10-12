package com.jc.entity;

import java.util.Date;

public class House {
    private Integer id;
    private Double acreage;
    private String type;
    private String high;
    private String structure;
    private Double innerAcreage;
    private String style;
    private String orientation;
    private String framework;
    private String renovation;
    private String proportion;
    private String elevator;
    private Double price;
    private Double unitPrice;
    private Date listingTime;
    private String tradingRights;
    private Date lastTransaction;
    private String use;
    private String life;
    private String belong;
    private String url;
    private String regionRid;
    private Date logDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAcreage() {
        return acreage;
    }

    public void setAcreage(Double acreage) {
        this.acreage = acreage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Double getInnerAcreage() {
        return innerAcreage;
    }

    public void setInnerAcreage(Double innerAcreage) {
        this.innerAcreage = innerAcreage;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getRenovation() {
        return renovation;
    }

    public void setRenovation(String renovation) {
        this.renovation = renovation;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public String getElevator() {
        return elevator;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getListingTime() {
        return listingTime;
    }

    public void setListingTime(Date listingTime) {
        this.listingTime = listingTime;
    }

    public String getTradingRights() {
        return tradingRights;
    }

    public void setTradingRights(String tradingRights) {
        this.tradingRights = tradingRights;
    }

    public Date getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(Date lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public String getUse() {
        return use;
    }

    public void setUser(String use) {
        this.use = use;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegionRid() {
        return regionRid;
    }

    public void setRegionRid(String regionRid) {
        this.regionRid = regionRid;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", acreage=" + acreage +
                ", type='" + type + '\'' +
                ", high='" + high + '\'' +
                ", structure='" + structure + '\'' +
                ", innerAcreage=" + innerAcreage +
                ", style='" + style + '\'' +
                ", orientation='" + orientation + '\'' +
                ", framework='" + framework + '\'' +
                ", renovation='" + renovation + '\'' +
                ", proportion='" + proportion + '\'' +
                ", elevator='" + elevator + '\'' +
                ", price=" + price +
                ", unitPrice=" + unitPrice +
                ", listingTime=" + listingTime +
                ", tradingRights='" + tradingRights + '\'' +
                ", lastTransaction=" + lastTransaction +
                ", use='" + use + '\'' +
                ", life='" + life + '\'' +
                ", belong='" + belong + '\'' +
                ", url='" + url + '\'' +
                ", regionRid='" + regionRid + '\'' +
                ", logDate=" + logDate +
                '}';
    }
}
