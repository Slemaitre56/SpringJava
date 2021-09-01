package com.mbc.photos.shop.domain;

public class ProductBasket {

    private String addedAt;

    public ProductBasket(String addedAt) {
        this.addedAt = addedAt;
    }

    public String getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }
}
