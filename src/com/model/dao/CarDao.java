package com.model.dao;

import com.model.entity.Car;

import java.util.List;

public interface CarDao {
    public int addCarDao(int goodId, String userName, String goodName, double goodPrice, String goodPic, int goodQuantity,
                         Double goodTotal);

    public List<Car> allcarDao(String user);
    public Car allRepeatDao(int goodId,String userName);
    public boolean allWhetherDao(int goodId,String userName);
    public boolean delcarDao(int goodId,String userName);
    public long allQuantityDao(String userName);
    public boolean delcarTotalDao(String userName);

}
