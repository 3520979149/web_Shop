package com.model.dao;

import com.model.entity.Good;

import java.util.List;

public interface GoodDao {
    public boolean delGoodByIdDao(int goodId);
    public Good allGoodXqDao(int goodId);
    public boolean updateSlCarDao(int goodId,String userName,int goodQuantity,Double goodTotal);
    public List<Good> allGoodSgDao();//水果
    public List<Good> allGoodLyfsDao();//粮油副食
    public List<Good> allGoodXhDao();//洗护
    public List<Good> allGoodSxjDao();//摄像机
    public List<Good> allGoodJdDao();//家电
    public List<Good> allGoodJjDao();//家具
    public List<Good> allGoodSjDao();//手机

    public List<Good> allGoodBlurDao(String BlurSearch);
    public List<Good> allGoodDao();


}
