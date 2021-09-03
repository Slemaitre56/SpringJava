package com.mbc.photos.shop.service;

import com.mbc.photos.shop.dao.BasketDao;

public class BasketService {

    private BasketDao basketDao;

    public BasketService(BasketDao basketDao) {
        this.basketDao = basketDao;
    }

}
