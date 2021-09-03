package com.mbc.photos.shop.dao.impl;

import com.mbc.photos.shop.dao.ProductDao;
import com.mbc.photos.shop.domain.Product;
import com.mbc.photos.shop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class ProductDaoInBdd implements ProductDao {

    private final ProductRepository productRepository;

    //POST
    @Override
    public void save(Product product) {
        productRepository.save(product);
    }


    //GET
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findAllByProductName(String productName) {
        return productRepository.findAllByProductNameContaining(productName);
    }

    @Override
    public List<Product> findAllByProductPrice(Double productPrice) {
        return productRepository.findAllByProductPrice(productPrice);
    }

    public Optional<Product> findByProductId(UUID productId) {
        return productRepository.findById(productId);
    }


    //PUT
    @Override
    public void update(Product product) {

    }


    //DELETE
    @Override
    public void deleteByProductId(UUID productId) {
        productRepository.deleteById(productId);
    }


}
