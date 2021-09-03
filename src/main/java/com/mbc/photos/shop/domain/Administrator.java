package com.mbc.photos.shop.domain;

import java.util.UUID;

public class Administrator extends User {

    public Administrator(UUID id, String name, String password, String hat) {
        super(id, name, password, hat);
    }
}
