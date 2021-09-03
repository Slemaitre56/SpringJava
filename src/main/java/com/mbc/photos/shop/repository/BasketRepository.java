package com.mbc.photos.shop.repository;

import com.mbc.photos.shop.domain.Basket;
import com.mbc.photos.shop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BasketRepository extends JpaRepository<Basket, UUID> {
    //List<Product> findAllByProductPrice(Double productPrice);
}
