package com.mbc.photos.shop.dao.impl;

import com.mbc.photos.shop.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BasketDaoInBdd {

    private final BasketRepository basketRepository;
}
