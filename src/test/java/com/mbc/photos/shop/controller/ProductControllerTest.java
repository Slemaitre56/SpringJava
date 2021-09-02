package com.mbc.photos.shop.controller;


import com.mbc.photos.shop.domain.Product;
import com.mbc.photos.shop.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.UUID;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @MockBean
    private ProductService productService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void findAll() throws Exception{
        when(productService.findAll()).thenReturn(Arrays.asList(
            new Product(UUID.fromString("11111111-1111-1111-1111-111111111111"),
                    "Photo de Loup", 7.99, "Photo de Loup", 5, "image de Loup")
        ));

        mockMvc.perform(get("/product"))
                .andExpect(jsonPath("$[0].productId", is("11111111-1111-1111-1111-111111111111")))
                .andExpect(jsonPath("$[0].productName", is("Photo de Loup")))
                .andExpect(jsonPath("$[0].productPrice", is(7.99)))
                .andExpect(jsonPath("$[0].productDescription", is("Photo de Loup")))
                .andExpect(jsonPath("$[0].productQuantity", is(5)))
                .andExpect(jsonPath("$[0].productPicture", is("image de Loup")));
    }

    @Test
    void add() throws Exception{
    }

    @Test
    void update() throws Exception{
        String bodyAsJson = "{\n" +
                "        \"productName\": \"Photo de Chat\",\n" +
                "        \"productPrice\": 19.99,\n" +
                "        \"productDescription\": \"Photo de Chat\",\n" +
                "        \"productQuantity\": 5,\n" +
                "        \"productPicture\": \"image de Chat\"\n" +
                "    }";

        mockMvc.perform(put("/product/11111111-1111-1111-1111-111111111111")
                .contentType(MediaType.APPLICATION_JSON)
                .content(bodyAsJson)
        ).andExpect(status().isOk());

        verify(productService).update(UUID.fromString("11111111-1111-1111-1111-111111111111"),
                new Product(null, "Photo de Chat", 19.99, "Photo de Chat", 5, "image de Chat"));

    }

    @Test
    void delete() throws Exception{
    }
}