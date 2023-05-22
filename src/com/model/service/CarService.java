package com.model.service;

import com.model.entity.Car;

import java.util.List;

public interface CarService {
    public int addCarService(int goodId, String userName, String goodName, double goodPrice, String goodPic,
                        int goodQuantity,
                         Double goodTotal);

    public List<Car> allcarService(String user);
    public Car allRepeatService(int goodId,String userName);
    public boolean allWhetherDao(int goodId,String userName);
    public boolean delcarService(int goodId,String userName);
    public long allQuantityService(String userName);
    public boolean delcarTotalService(String userName);
}
