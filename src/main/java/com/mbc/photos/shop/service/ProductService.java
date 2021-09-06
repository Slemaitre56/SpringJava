package com.mbc.photos.shop.service;

import com.mbc.photos.shop.dao.ProductDao;
import com.mbc.photos.shop.domain.Product;
import com.mbc.photos.shop.exception.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import org.slf4j.Logger;

@Service
public class ProductService {

    private ProductDao productDao;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    //POST
    @Transactional
    public void save(String name, Double price, String description, int quantity, String picture) {
        Product newProduct = new Product(UUID.randomUUID(), name, price, description, quantity, picture);
        productDao.save(newProduct);
        logger.info("[PRODUCT SAVE]Création d'un nouveau produit : {}", newProduct);
    }

    //GET
    public List<Product> findAll() {
        return productDao.findAll();
    }

    public List<Product> findAllByProductName(String productName) {
        return productDao.findAllByProductName(productName);
    }

    public List<Product> findAllByProductPrice(Double productPrice) { return productDao.findAllByProductPrice(productPrice);}

    public Product findById(UUID productId) {
        return productDao.findByProductId(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId));
    }

    //DELETE
    public void delete(UUID productId) {
        productDao.deleteByProductId(productId);
    }

    //PUT
    public void update(UUID productId, Product product) {
        Product currentProduct = findById(productId);
        currentProduct.setProductName(product.getProductName());
        currentProduct.setProductPrice(product.getProductPrice());
        currentProduct.setProductDescription(product.getProductDescription());
        currentProduct.setProductQuantity(product.getProductQuantity());
        currentProduct.setProductPicture(product.getProductPicture());
        productDao.save(currentProduct);
    }
}
