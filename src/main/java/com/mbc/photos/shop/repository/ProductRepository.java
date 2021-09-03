package com.mbc.photos.shop.repository;

import com.mbc.photos.shop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    List<Product> findAllByProductNameContaining(String productName);
    List<Product> findAllByProductPrice(Double productPrice);

}
