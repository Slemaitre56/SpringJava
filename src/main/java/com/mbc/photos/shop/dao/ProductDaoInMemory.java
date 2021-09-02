package com.mbc.photos.shop.dao;
import com.mbc.photos.shop.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class ProductDaoInMemory implements ProductDao{

    private List<Product> products = new ArrayList<>();

    //CREATE
    @Override
    public void add(Product product) {
        products.add(product);

    };

    //READ
    @Override
    public List<Product> findAll() {
        return products;
    };

    @Override
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

    @Override
    public Optional<Product> findById(UUID productId) {
        return products.stream()
                .filter((product -> product.getProductId().equals(productId)))
                .findFirst();
    }


    //DELETE
    @Override
    public void delete(UUID productId) {
        products.removeIf(book -> book.getProductId().equals(productId));
    }

    //UPDATE
    @Override
    public void update(Product product) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (product.getProductId().equals(products.get(i).getProductId())) {
                index = i;
            }
        }
        products.set(index, product);
    }



}
