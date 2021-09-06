package com.mbc.photos.shop.repository;

import com.mbc.photos.shop.domain.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BasketRepository extends JpaRepository<Basket, UUID> {

}
