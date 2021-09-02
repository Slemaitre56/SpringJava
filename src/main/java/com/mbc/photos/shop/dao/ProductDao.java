package com.mbc.photos.shop.dao;

import com.mbc.photos.shop.domain.Product;
import java.util.Optional;
import java.util.UUID;
import java.util.*;

public interface ProductDao {

    List<Product> findAll();

    List<Product> searchByProductName(String productName);

    List<Product> searchByProductPrice(Double productPrice);

    void add(Product product);

    Optional<Product> findById(UUID productId);

    void delete(UUID productId);

    void update(Product product);

}
