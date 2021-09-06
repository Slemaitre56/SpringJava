package com.mbc.photos.shop.dao.impl;

import com.mbc.photos.shop.dao.BasketDao;
import com.mbc.photos.shop.domain.Basket;
import com.mbc.photos.shop.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class BasketDaoInBdd implements BasketDao {

    private final BasketRepository basketRepository;

    //POST
    //GET

    @Override
    public List<Basket> findAll() {
        return basketRepository.findAll();
    }


    @Override
    public Optional<Basket> findByBasketId(UUID basketId) {
        return basketRepository.findById(basketId);
    }

    //PUT

    //DELETE
    @Override
    public void deleteByBasketId(UUID basketId) { basketRepository.deleteById(basketId);}
}
