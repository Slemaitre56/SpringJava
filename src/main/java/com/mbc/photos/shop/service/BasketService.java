package com.mbc.photos.shop.service;

import com.mbc.photos.shop.dao.BasketDao;
import com.mbc.photos.shop.domain.Basket;
import com.mbc.photos.shop.exception.BasketNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BasketService {

    private BasketDao basketDao;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public BasketService(BasketDao basketDao) {
        this.basketDao = basketDao;
    }

    //POST


    //GET
    public List<Basket> findAll() {
        return basketDao.findAll();
    }

    public Basket findById(UUID basketId) {
        return basketDao.findByBasketId(basketId)
                .orElseThrow(() -> new BasketNotFoundException(basketId));
    }
    //PUT

    //DELETE
    public void delete(UUID basketId) {
        basketDao.deleteByBasketId(basketId);
    }

}
