package com.model.dao.impl;

import com.model.dao.CarDao;
import com.model.entity.Car;
import com.model.entity.Good;
import com.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    @Override
    public int addCarDao(int goodId, String userName, String goodName, double goodPrice, String goodPic, int goodQuantity,
                         Double goodTotal) {
        String sql = "insert into car(goodId,userName,goodName,goodPrice,goodPic,goodQuantity,goodTotal) values(?,?," +
                "?,?,?,?,?)";
        int num = 0;
        try {
            num = DBUtil.queryRunner.update(sql, goodId, userName, goodName, goodPrice, goodPic, goodQuantity, goodTotal);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }



    @Override
    public List<Car> allcarDao(String user) {
        List<Car> cars = new ArrayList<>();
        String sql = "select * from car where userName=?";
        List<Car> list=null;
        try {
            list= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Car.class),user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Car car : list) {
            Car car1=new Car();
            car1.setGoodId(car.getGoodId());
            car1.setGoodName(car.getGoodName());
            car1.setUserName(car.getUserName());
            car1.setGoodQuantity(car.getGoodQuantity());
            car1.setGoodPrice(car.getGoodPrice());
            car1.setGoodPic(car.getGoodPic());
            car1.setGoodTotal(car.getGoodTotal());
            car1.setUserNameId(car.getUserNameId());
            cars.add(car1);
        }
        return cars;
    }

    @Override
    public Car allRepeatDao(int goodId, String userName) {
        Car car = null;
        String sql = "select * from car where goodId=? and userName=?";
        try {
            car= DBUtil.queryRunner.query(sql, new BeanHandler<>(Car.class),goodId,userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return car;
    }

    @Override
    public boolean allWhetherDao(int goodId, String userName) {
        Car car = null;
        boolean flag=false;
        String sql = "select * from car where goodId=? and userName=?";
        try {
            car= DBUtil.queryRunner.query(sql, new BeanHandler<>(Car.class),goodId,userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(car==null){
            flag=false;
        }else {
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean delcarDao(int goodId,String userName) {
        boolean flag;
        String sql = "delete from car where goodId=? and userName=?";

        int num= 0;
        try {
            num = DBUtil.queryRunner.update(sql,goodId,userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(num>0){
            flag = true;
        }else {
            flag=false;
        }
        return flag;
    }

    @Override
    public long allQuantityDao(String userName) {
        String sql = "select count(*) from car where userName=?";
        long num = 0;
        try {
            num =  DBUtil.queryRunner.query(sql,new ScalarHandler<>(),userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }

    @Override
    public boolean delcarTotalDao(String userName) {
        boolean flag;
        String sql = "delete from car where userName=?";

        int num= 0;
        try {
            num = DBUtil.queryRunner.update(sql,userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(num>0){
            flag = true;
        }else {
            flag=false;
        }
        return flag;
    }
}
