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


    //POST
    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.CREATED)
    void save(@RequestBody Product product ) {
        productService.save(
                product.getProductName(),
                product.getProductPrice(),
                product.getProductDescription(),
                product.getProductQuantity(),
                product.getProductPicture());
    }


    //GET
    @GetMapping("")
    public List<Product> findAll() { return productService.findAll();}

    @GetMapping("/name/{productName}")
    public List<Product> findAllByProductName(@PathVariable String productName) {
        return productService.findAllByProductName(productName);
    }

    @GetMapping("/price/{productPrice}")
    public List<Product> findAllByProductPrice(@PathVariable Double productPrice) {
        return productService.findAllByProductPrice(productPrice);
    }

    @GetMapping("/{productId}")
    Product findByProductId(@PathVariable UUID productId) {
        return productService.findById(productId);
    }


    //PUT
    @PutMapping("/{productId}")
    void update(@PathVariable UUID productId,@RequestBody Product product) {
        productService.update(productId, product);
    }

    //DELETE
    @DeleteMapping("/{productId}")
    void delete(@PathVariable UUID productId) {
        productService.delete(productId);
    }
}
