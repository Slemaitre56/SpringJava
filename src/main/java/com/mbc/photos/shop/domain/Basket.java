package com.mbc.photos.shop.domain;

import java.util.UUID;

public class Basket {

    private UUID basketId;
    private int basketQuantity;
    private float basketPrice;

    public Basket(UUID basketId, int basketQuantity, float basketPrice) {
        this.basketId = basketId;
        this.basketQuantity = basketQuantity;
        this.basketPrice = basketPrice;
    }

    public UUID getBasketId() {
        return basketId;
    }

    public void setBasketId(UUID basketId) {
        this.basketId = basketId;
    }

    public int getBasketQuantity() {
        return basketQuantity;
    }

    public void setBasketQuantity(int basketQuantity) {
        this.basketQuantity = basketQuantity;
    }

    public float getBasketPrice() {
        return basketPrice;
    }

    public void setBasketPrice(float basketPrice) {
        this.basketPrice = basketPrice;
    }


}
