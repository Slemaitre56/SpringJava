package com.mbc.photos.shop.controller;

import com.mbc.photos.shop.service.BasketService;

public class BasketController {

    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
}
