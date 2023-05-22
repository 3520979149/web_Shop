package com.model.service.impl;

import com.model.dao.CarDao;
import com.model.dao.impl.CarDaoImpl;
import com.model.entity.Car;
import com.model.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao=new CarDaoImpl();
    @Override
    public int addCarService(int goodId, String userName, String goodName, double goodPrice, String goodPic, int goodQuantity, Double goodTotal) {
        return carDao.addCarDao(goodId, userName, goodName, goodPrice, goodPic, goodQuantity, goodTotal);
    }


    @Override
    public List<Car> allcarService(String user) {
        return carDao.allcarDao(user);
    }

    @Override
    public Car allRepeatService(int goodId, String userName) {
        return carDao.allRepeatDao(goodId, userName);
    }

    @Override
    public boolean allWhetherDao(int goodId, String userName) {
        return carDao.allWhetherDao(goodId, userName);
    }

    @Override
    public boolean delcarService(int goodId,String userName) {
        return carDao.delcarDao(goodId,userName);
    }

    @Override
    public long allQuantityService(String userName) {
        return carDao.allQuantityDao(userName);
    }

    @Override
    public boolean delcarTotalService(String userName) {
        return carDao.delcarTotalDao(userName);
    }
}
