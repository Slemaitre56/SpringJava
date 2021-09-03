package com.mbc.photos.shop.dao;

import com.mbc.photos.shop.domain.Product;
import java.util.Optional;
import java.util.UUID;
import java.util.*;

public interface ProductDao {

    //POST
    void save(Product product);

    //GET
    List<Product> findAll();

    List<Product> findAllByProductName(String productName);

    List<Product> findAllByProductPrice(Double productPrice);

    Optional<Product> findByProductId(UUID productId);

    //PUT
    void update(Product product);

    //DELETE
    void deleteByProductId(UUID productId);

}
