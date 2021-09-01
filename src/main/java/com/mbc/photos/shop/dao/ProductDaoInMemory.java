package com.mbc.photos.shop.dao;
import com.mbc.photos.shop.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class ProductDaoInMemory implements ProductDao{

    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return products;
    };

    @Override
    public void add(Product product) {
        products.add(product);
    };

    public List<Product> searchByProductName(String productName) {
        return products.stream()
                .filter(product -> product.getProductName().toLowerCase().contains(productName.toLowerCase()))
                .collect(Collectors.toList());
    };

    @Override
    public List<Product> searchByProductPrice(Double productPrice) {
        return products.stream()
                .filter(product -> product.getProductPrice().equals(productPrice))
                .collect(Collectors.toList());
    };

}
