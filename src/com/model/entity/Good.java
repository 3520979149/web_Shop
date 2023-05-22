package com.model.entity;

public class Good {
    private int goodId;
    private String goodName;//商品名称
    private String goodCategory;//商品类型
    private String goodDes;//商品介绍
    private String goodPrice;//商品价格
    private String goodPic;//商品图片
    private String goodStock;//商品克重

    public Good(int goodId, String goodName, String goodCategory, String goodDes, String goodPrice, String goodPic, String goodStock) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodCategory = goodCategory;
        this.goodDes = goodDes;
        this.goodPrice = goodPrice;
        this.goodPic = goodPic;
        this.goodStock = goodStock;
    }

    public Good() {
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodCategory() {
        return goodCategory;
    }

    public void setGoodCategory(String goodCategory) {
        this.goodCategory = goodCategory;
    }

    public String getGoodDes() {
        return goodDes;
    }

    public void setGoodDes(String goodDes) {
        this.goodDes = goodDes;
    }

    public String getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(String goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodPic() {
        return goodPic;
    }

    public void setGoodPic(String goodPic) {
        this.goodPic = goodPic;
    }

    public String getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(String goodStock) {
        this.goodStock = goodStock;
    }
}
