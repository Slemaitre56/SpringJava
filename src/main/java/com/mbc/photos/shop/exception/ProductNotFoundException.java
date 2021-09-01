package com.mbc.photos.shop.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Double productPrice) {
        super("Aucun produit n'a été trouvé au prix de " +productPrice.toString());
    }

}
