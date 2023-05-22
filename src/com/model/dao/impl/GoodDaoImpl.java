package com.model.dao.impl;

import com.model.dao.GoodDao;
import com.model.entity.Good;
import com.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodDaoImpl implements GoodDao {
    List<Good> list = null;
    @Override
    public List<Good> allGoodSgDao() {
        List<Good> goods = new ArrayList<>();
        String sql = "select * from good where goodCategory='水果'";

        try {
            list= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Good good : list) {
            Good good1 = new Good();
            good1.setGoodId(good.getGoodId());
            good1.setGoodName(good.getGoodName());
            good1.setGoodCategory(good.getGoodCategory());
            good1.setGoodDes(good.getGoodDes());
            good1.setGoodPrice(good.getGoodPrice());
            good1.setGoodPic(good.getGoodPic());
            good1.setGoodStock(good.getGoodStock());
            goods.add(good1);
        }
        return goods;
    }

    @Override
    public List<Good> allGoodLyfsDao() {
        List<Good> goods = new ArrayList<>();
        String sql = "select * from good where goodCategory='粮油副食'";
        try {
            list= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Good good : list) {
            Good good1 = new Good();
            good1.setGoodId(good.getGoodId());
            good1.setGoodName(good.getGoodName());
            good1.setGoodCategory(good.getGoodCategory());
            good1.setGoodDes(good.getGoodDes());
            good1.setGoodPrice(good.getGoodPrice());
            good1.setGoodPic(good.getGoodPic());
            good1.setGoodStock(good.getGoodStock());
            goods.add(good1);
        }
        return goods;
    }

    @Override
    public List<Good> allGoodXhDao() {
        List<Good> goods = new ArrayList<>();
        String sql = "select * from good where goodCategory='洗护'";

        try {
            list= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Good good : list) {
            Good good1 = new Good();
            good1.setGoodId(good.getGoodId());
            good1.setGoodName(good.getGoodName());
            good1.setGoodCategory(good.getGoodCategory());
            good1.setGoodDes(good.getGoodDes());
            good1.setGoodPrice(good.getGoodPrice());
            good1.setGoodPic(good.getGoodPic());
            good1.setGoodStock(good.getGoodStock());
            goods.add(good1);
        }
        return goods;
    }

    @Override
    public List<Good> allGoodSxjDao() {
        List<Good> goods = new ArrayList<>();
        String sql = "select * from good where goodCategory='摄像机'";
        try {
            list= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Good good : list) {
            Good good1 = new Good();
            good1.setGoodId(good.getGoodId());
            good1.setGoodName(good.getGoodName());
            good1.setGoodCategory(good.getGoodCategory());
            good1.setGoodDes(good.getGoodDes());
            good1.setGoodPrice(good.getGoodPrice());
            good1.setGoodPic(good.getGoodPic());
            good1.setGoodStock(good.getGoodStock());
            goods.add(good1);
        }
        return goods;
    }

    @Override
    public List<Good> allGoodJdDao() {
        List<Good> goods = new ArrayList<>();
        String sql = "select * from good where goodCategory='家电'";

        try {
            list= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Good good : list) {
            Good good1 = new Good();
            good1.setGoodId(good.getGoodId());
            good1.setGoodName(good.getGoodName());
            good1.setGoodCategory(good.getGoodCategory());
            good1.setGoodDes(good.getGoodDes());
            good1.setGoodPrice(good.getGoodPrice());
            good1.setGoodPic(good.getGoodPic());
            good1.setGoodStock(good.getGoodStock());
            goods.add(good1);
        }
        return goods;
    }

    @Override
    public List<Good> allGoodJjDao() {
        List<Good> goods = new ArrayList<>();
        String sql = "select * from good where goodCategory='家具'";

        try {
            list= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Good good : list) {
            Good good1 = new Good();
            good1.setGoodId(good.getGoodId());
            good1.setGoodName(good.getGoodName());
            good1.setGoodCategory(good.getGoodCategory());
            good1.setGoodDes(good.getGoodDes());
            good1.setGoodPrice(good.getGoodPrice());
            good1.setGoodPic(good.getGoodPic());
            good1.setGoodStock(good.getGoodStock());
            goods.add(good1);
        }
        return goods;
    }

    @Override
    public List<Good> allGoodSjDao() {
        List<Good> goods = new ArrayList<>();
        String sql = "select * from good where goodCategory='手机'";

        try {
            list= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Good good : list) {
            Good good1 = new Good();
            good1.setGoodId(good.getGoodId());
            good1.setGoodName(good.getGoodName());
            good1.setGoodCategory(good.getGoodCategory());
            good1.setGoodDes(good.getGoodDes());
            good1.setGoodPrice(good.getGoodPrice());
            good1.setGoodPic(good.getGoodPic());
            good1.setGoodStock(good.getGoodStock());
            goods.add(good1);
        }
        return goods;
    }

    @Override
    public List<Good> allGoodBlurDao(String BlurSearch) {
        List<Good> goods = new ArrayList<>();
        String sql="SELECT * FROM `good` where goodName like ? OR goodCategory LIKE ? or goodDes like ?";
        try {
            goods= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class),BlurSearch,BlurSearch,BlurSearch);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return goods;
    }

    @Override
    public List<Good> allGoodDao() {
        List<Good> goods = new ArrayList<>();
        String sql="SELECT * FROM `good`";
        try {
            goods= DBUtil.queryRunner.query(sql, new BeanListHandler<>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return goods;    }


    @Override
    public boolean delGoodByIdDao(int goodId) {
        boolean flag;
        String sql = "delete from good where goodId=?";

        int num= 0;
        try {
            num = DBUtil.queryRunner.update(sql,goodId);
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
    public Good allGoodXqDao(int goodId) {
        Good goods = null;
        String sql = "select * from good where goodId=?";

        try {
            goods= DBUtil.queryRunner.query(sql, new BeanHandler<>(Good.class),goodId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goods;
    }
    @Override
    public boolean updateSlCarDao(int goodId,String userName,int goodQuantity,Double goodTotal) {
        String sql="update car set goodQuantity=?,goodTotal=? where goodId=? and userName=?";
        int num = 0;
        boolean flag=false;
        try {
            num = DBUtil.queryRunner.update(sql,goodQuantity,goodTotal,goodId,userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(num>0){
            flag=true;

        }else {
            flag=false;
        }
        return flag;
    }


}
