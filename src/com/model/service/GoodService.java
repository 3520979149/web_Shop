package com.model.service;

import com.model.entity.Good;

import java.util.List;

public interface GoodService {
    public boolean updateSlCarService(int goodId,String userName,int goodQuantity,Double goodTotal);
    public List<Good> allGoodSgService();//水果
    public List<Good> allGoodLyfsService();//粮油副食
    public List<Good> allGoodXhService();//洗护
    public List<Good> allGoodSxjService();//摄像机
    public List<Good> allGoodJdService();//家电
    public List<Good> allGoodJjService();//家具
    public List<Good> allGoodSjService();//手机
    public boolean delGoodByIdService(int goodId);
    public boolean addGoodService(Good good);
    public Good allGoodXqService(int goodId);
    public List<Good> allGoodBlurService(String BlurSearch);
    public List<Good> allGoodService();

}
