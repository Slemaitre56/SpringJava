package com.mbc.photos.shop.domain;

import java.util.UUID;

public class Customer extends User {

    public Customer(UUID id, String name, String password, String hat) {
        super(id, name, password, hat);
    }

}
