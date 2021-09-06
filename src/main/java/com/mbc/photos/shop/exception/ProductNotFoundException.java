package com.mbc.photos.shop.exception;

import java.util.UUID;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(UUID productId) {
        super("Aucun produit n'a été trouvé avec l'id : " + productId.toString());
    }

}
