package com.mbc.photos.shop.service;
import com.mbc.photos.shop.dao.ProductDao;
import com.mbc.photos.shop.domain.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void add(String name, Double price, String description, int quantity, String picture) {
        Product newProduct = new Product(UUID.randomUUID(), name, price, description, quantity, picture);
        productDao.add(newProduct);
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public List<Product> searchByProductName(String productName) {
        return productDao.searchByProductName(productName);
    }

    public List<Product> searchByProductPrice(Double productPrice) { return productDao.searchByProductPrice(productPrice);};
}
