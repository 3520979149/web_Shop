package com.model.service.impl;

import com.model.dao.GoodDao;
import com.model.dao.impl.GoodDaoImpl;
import com.model.entity.Good;
import com.model.service.GoodService;

import java.util.List;

public class GoodServiceImpl implements GoodService {
    private GoodDao goodDao=new GoodDaoImpl();

    @Override
    public List<Good> allGoodXhService() {
        return goodDao.allGoodXhDao();
    }

    @Override
    public List<Good> allGoodSxjService() {
        return goodDao.allGoodSxjDao();
    }

    @Override
    public List<Good> allGoodJdService() {
        return goodDao.allGoodJdDao();
    }

    @Override
    public List<Good> allGoodJjService() {
        return goodDao.allGoodJjDao();
    }

    @Override
    public List<Good> allGoodSjService() {
        return goodDao.allGoodSjDao();
    }

    @Override
    public List<Good> allGoodSgService() {
        return goodDao.allGoodSgDao();
    }

    @Override
    public List<Good> allGoodLyfsService() {
        return goodDao.allGoodLyfsDao();
    }


    @Override
    public boolean delGoodByIdService(int goodId) {
        return goodDao.delGoodByIdDao(goodId);    }

    @Override
    public boolean addGoodService(Good good) {
        return false;
    }

    @Override
    public Good allGoodXqService(int goodId) {
        return goodDao.allGoodXqDao(goodId);
    }

    @Override
    public List<Good> allGoodBlurService(String BlurSearch) {
        return goodDao.allGoodBlurDao(BlurSearch);
    }

    @Override
    public List<Good> allGoodService() {
        return goodDao.allGoodDao();
    }

    @Override
    public boolean updateSlCarService(int goodId, String userName, int goodQuantity,Double goodTotal) {
        return goodDao.updateSlCarDao(goodId, userName, goodQuantity,goodTotal);
    }
}
