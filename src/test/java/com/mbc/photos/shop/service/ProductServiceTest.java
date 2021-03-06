package com.mbc.photos.shop.service;

import com.mbc.photos.shop.dao.ProductDao;
import com.mbc.photos.shop.domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class ProductServiceTest {
    ProductDao mockDao;
    ProductService productService;
    List<Product> expectedProducts = Arrays.asList(
            new Product(UUID.randomUUID(),
                    "Photo de Lion",
                    19.99,
                    "Photo de Lion",
                    5,
                    "image de Lion"),
            new Product(UUID.randomUUID(),
                    "Photo de Serpent",
                    69.99,
                    "Photo de Serpent",
                    5,
                    "image de Serpent")
    );

    @BeforeEach
    public void setup() {
        mockDao = mock(ProductDao.class);
        productService = new ProductService(mockDao);
    }

    @Test
    public void findAllByProductName() {
        when(mockDao.findAllByProductName("Photo")).thenReturn(expectedProducts);
        List<Product> actualProducts = productService.findAllByProductName("Photo");
        assertEquals(actualProducts, equalTo(expectedProducts));
    }


    @Test
    public void searchByProductName_noResult() {
        when(mockDao.findAllByProductName("Image")).thenReturn(new ArrayList<>());
        List<Product> actualProducts = productService.findAllByProductName("Image");
        assertEquals(actualProducts.size(), equalTo(0));
    }

    @Test
    public void findAllByProductPrice() {
        when(mockDao.findAllByProductPrice(19.99)).thenReturn(expectedProducts);
        List<Product> actualProducts = productService.findAllByProductPrice(19.99);
        assertEquals(actualProducts, equalTo(expectedProducts));
    }

    @Test
    public void searchByProductPrice_noResult() {
        when(mockDao.findAllByProductPrice(00.00)).thenReturn(expectedProducts);
        List<Product> actualProducts = productService.findAllByProductPrice(00.00);
        assertEquals(actualProducts, equalTo(expectedProducts));
    }

    @Test
    public void add() {
        productService.save(
                "Photo de Chat",
                17.99,
                "Photo de Chat",
                9,
                "image de Chat");

        ArgumentCaptor<Product> productArgumentCaptor = ArgumentCaptor.forClass(Product.class);
        verify(mockDao).save(productArgumentCaptor.capture());
        Product productSentToDao = productArgumentCaptor.getValue();
        assertEquals(productSentToDao.getProductId(), is(notNullValue()));
        assertEquals(productSentToDao.getProductName(), is("Toto"));
    }


}