package com.mbc.photos.shop.exception;

import java.util.UUID;

public class BasketNotFoundException extends RuntimeException{

    public BasketNotFoundException(UUID basketId) {
        super("Aucun panier n'a été trouvé avec l'id : " + basketId.toString());
    }

}
