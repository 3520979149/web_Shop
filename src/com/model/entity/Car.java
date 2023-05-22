package com.model.entity;

public class Car {
    private int goodId;//商品id
    private String userName;//用户名称
    private String goodName;//商品名称
    private Double goodPrice;//商品价格
    private String goodPic;//商品图片
    private int goodQuantity;//商品数量
    private Double goodTotal;//价格总计
    private String userNameId;

    public Car() {
    }

    public Car(int goodId, String userName, String goodName, Double goodPrice, String goodPic, int goodQuantity, Double goodTotal) {
        this.goodId = goodId;
        this.userName = userName;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodPic = goodPic;
        this.goodQuantity = goodQuantity;
        this.goodTotal = goodTotal;
    }

    public String getUserNameId() {
        return userNameId;
    }

    public void setUserNameId(String userNameId) {
        this.userNameId = userNameId;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodPic() {
        return goodPic;
    }

    public void setGoodPic(String goodPic) {
        this.goodPic = goodPic;
    }

    public int getGoodQuantity() {
        return goodQuantity;
    }

    public void setGoodQuantity(int goodQuantity) {
        this.goodQuantity = goodQuantity;
    }

    public Double getGoodTotal() {
        return goodTotal;
    }

    public void setGoodTotal(Double goodTotal) {
        this.goodTotal = goodTotal;
    }
}
