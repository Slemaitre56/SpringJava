package com.mbc.photos.shop.controller;

import com.mbc.photos.shop.domain.Basket;
import com.mbc.photos.shop.service.BasketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/basket")
public class BasketController {

    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    //POST


    //GET
    @GetMapping("")
    public List<Basket> findAll() { return basketService.findAll();}

    @GetMapping("/{basketId}")
    Basket findByBasketId(@PathVariable UUID basketId) { return basketService.findById(basketId);}


    //UPDATE

    //DELETE
    @DeleteMapping("/{basketId}")
    void delete(@PathVariable UUID basketId) {
        basketService.delete(basketId);
    }

}
