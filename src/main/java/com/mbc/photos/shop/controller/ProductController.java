package com.mbc.photos.shop.controller;

import com.mbc.photos.shop.domain.Product;
import com.mbc.photos.shop.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public List<Product> findAll() { return productService.findAll();};

    @GetMapping("/name/{productName}")
    public List<Product> searchByProductName(@PathVariable String productName) {
        return productService.searchByProductName(productName);
    }

    @GetMapping("/{productId}")
    Product findById(@PathVariable UUID productId) {
        return productService.findById(productId);
    }

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    void add(@RequestBody Product product ) {
        productService.add(product.getProductName(), product.getProductPrice(), product.getProductDescription(), product.getProductQuantity(), product.getProductPicture());
    };

    @PutMapping("/{productId}")
    void update(@PathVariable UUID productId,@RequestBody Product product) {
        productService.update(productId, product);

    }

    @DeleteMapping("/{productId}")
    void delete(@PathVariable UUID productId) {
        productService.delete(productId);
    };
}
