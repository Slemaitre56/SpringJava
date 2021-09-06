package com.mbc.photos.shop.dao;

import com.mbc.photos.shop.domain.Basket;



import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BasketDao {


    //POST

    //GET
    List<Basket> findAll();

    Optional<Basket> findByBasketId(UUID basketId);

    //PUT

    //DELETE
    void deleteByBasketId(UUID basketId);

}
